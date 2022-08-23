package jdbc;

import javax.sql.rowset.JdbcRowSet;
import java.io.File;
import java.sql.SQLException;

public class JdbcTowSetExample {
    public static void main(String[] args) throws SQLException {
        JdbcRowSet jdbcRs = new JdbcRowSetImpl();
        File file = new File("sampledb");
        jdbcRs.setUrl("jdbc:derby:"+file);
        jdbcRs.setCommand("select *");
        jdbcRs.execute();

        while (jdbcRs.next()){
            System.out.println(jdbcRs.getInt(1)+"\t"+jdbcRs.getString("name"));
        }
        jdbcRs.close();
    }
}
