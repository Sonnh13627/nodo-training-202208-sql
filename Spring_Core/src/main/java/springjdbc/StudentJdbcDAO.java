package springjdbc;

import org.apache.derby.iapi.store.raw.Transaction;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.StatementCallback;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentJdbcDAO {
    private static Logger LOGGER = Logger.getLogger(String.valueOf(StudentJdbcDAO.class));
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    private String insertQuery;

    private void createTableIfNotExist() throws SQLException {
        DatabaseMetaData dbmd = dataSource.getConnection().getMetaData();
        ResultSet rs = dbmd.getTables(null, null, "STUDENT", null);
        if (rs.next()) {
            LOGGER.info("Table" + rs.getString("TABLE_NAME") + "already exists");
            return;
        }
        jdbcTemplate.execute("CREATE TABLE STUDENT" +
                "(id int not null auto_increment," +
                "name varchar(225)," +
                "age  int ," +
                "primary key(id))");
    }

    public void setDataSource(DriverManagerDataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void insert(String name, Integer age) {
        jdbcTemplate.update(insertQuery, name, age);
        LOGGER.info("Create Record Name =" + name + "Age = " + age);
    }

    public void setInsertQuery(String insertQuery) {
        this.insertQuery = insertQuery;
    }

    public int totalRecord() {
        return jdbcTemplate.execute(new StatementCallback<Integer>() {
            @Override
            public Integer doInStatement(Statement statement) throws SQLException, DataAccessException {
                ResultSet rs = statement.executeQuery("select count(*) from student");
                return rs.next() ? rs.getInt(1) : 0;
            }
        });
    }

    public final static class StudentRowMapper implements RowMapper<Student> {
        ResultSet rs;

        @Override
        public Student mapRow(ResultSet resultSet, int i) throws SQLException {

            try {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                return student;
            } catch (Exception e) {
                LOGGER.error(e, e);
                return null;
            }

        }
    }

    public List loadStudent(String name) {
        return jdbcTemplate.query("SELECT * FROM STUDENT WHERE NAME LIKE '%" + name + "%'", new StudentRowMapper());
    }

    public int[] add(List<Student> students) {
        List<Object[]> batch = new ArrayList<>();
        students.forEach(student -> batch.add(new Object[]{student.getName(),student.getAge()}));
        return jdbcTemplate.batchUpdate(insertQuery,batch);
    }

    @Autowired
    private PlatformTransactionManager transactionManager=new PlatformTransactionManager() {
        @Override
        public TransactionStatus getTransaction(TransactionDefinition transactionDefinition) throws TransactionException {
            return null;
        }

        @Override
        public void commit(TransactionStatus transactionStatus) throws TransactionException {

        }

        @Override
        public void rollback(TransactionStatus transactionStatus) throws TransactionException {

        }
    };
    public void save(Object name, Object age){
        TransactionDefinition def = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(def);

        String countQuery = "SELECT COUNT(*)FROM STUDENT";
        try {
            Integer total = jdbcTemplate.queryForObject(countQuery,Integer.class);
            LOGGER.info("before save data, total record is" +total);
            String sql = "INSERT INTO STUDENT(NAME,AGE) VALUES(?,?)";
            jdbcTemplate.update(sql,name,age);

            total = jdbcTemplate.queryForObject(countQuery,Integer.class);
            LOGGER.info("after save data, total record is "+total);

            String countQuery2 = "SELECT COUNT(*) FROM STUDENT";
            total = jdbcTemplate.queryForObject(countQuery2,Integer.class);
            transactionManager.commit(status);
        }catch (Exception e){
            transactionManager.rollback(status);
            Integer total = jdbcTemplate.queryForObject(countQuery, Integer.class);
            LOGGER.info("after rollback, total record is"+total);
        }
    }
}
