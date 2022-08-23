package jdbc;

import java.sql.*;

public class JdbcFirstExample {
    static Connection con = null;
    static Statement statement = null;

    public static void main(String args[]) throws SQLException {
        TransactionExample();
    }

    public static void create() throws SQLException {

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl", "SCOTT", "SCOTT");
            statement = con.createStatement();
            System.out.println("Connect database successful!");

            String sql = "CREATE TABLE FUN_STUDENT (" +
                    "ID NUMBER(2) NOT NULL CONSTRAINT PK_STUDENT_FUN PRIMARY KEY, " +
                    "NAME VARCHAR2(50), " +
                    "AGE  NUMBER(2)" +
                    ")";
            boolean resul = statement.execute(sql);
            System.out.println(resul);

            String sql2 = "CREATE SEQUENCE SEQ_STUDENT_FUN INCREMENT BY 1 START WITH 1 NOCYCLE";
            System.out.println(statement.execute(sql2));
            System.out.println("Thanh cong");
//            ResultSet rs = statement.executeQuery("select * from FUN_STUDENT");
//            while (rs.next()) System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            statement.close();
            con.close();
        }
    }

    public static void InsertDataExample() throws SQLException {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl", "SCOTT", "SCOTT");
            statement = con.createStatement();

            statement.execute("INSERT INTO FUN_STUDENT VALUES (SEQ_STUDENT_FUN.nextval, 'THIEU QUANG VINH', 20)");
            statement.execute("INSERT INTO FUN_STUDENT VALUES (SEQ_STUDENT_FUN.nextval, 'DO TAT HOA', 20)");
            statement.execute("INSERT INTO FUN_STUDENT VALUES (SEQ_STUDENT_FUN.nextval, 'NGUYEN HONG SON', 20)");
            System.out.println("Thêm thành công");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            statement.close();
            con.close();
        }
    }

    public static void selectDataExample() throws SQLException {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl", "SCOTT", "SCOTT");
            statement = con.createStatement();
            System.out.println("Connect database successful!");
            ResultSet rs = statement.executeQuery("select * from FUN_STUDENT");
            while (rs.next()) System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            statement.close();
            con.close();
        }
    }

    public static void UpdateDataExample() throws SQLException {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl", "SCOTT", "SCOTT");
            statement = con.createStatement();
            System.out.println("Connect database successful!");

            PreparedStatement ps = con.prepareStatement("UPDATE FUN_STUDENT SET Name = ? WHERE ID =?");

            ps.setString(1, "Pham Thi Thuy");
            ps.setInt(2, 1);
            ps.executeUpdate();
            System.out.println("update thanh cong");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            con.close();
        }
    }

    public static void TransactionExample() throws SQLException {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl", "SCOTT", "SCOTT");
            statement = con.createStatement();

            con.setAutoCommit(false);
            for (int i = 0; i < 10; i++) {
                String name = "DO TAT " + i;
                int age = 10 + i;
                PreparedStatement ps = con.prepareStatement("INSERT INTO FUN_STUDENT VALUES (SEQ_STUDENT_FUN.nextval, ?, ?)");
                ps.setString(1, name);
                ps.setInt(2, age);
                ps.executeUpdate();
            }

            con.rollback();
            con.setAutoCommit(true);
            ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM FUN_STUDENT");
            if (rs.next()) {
                System.out.println("Total record = " + rs.getInt(1));
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void BatchProcessingExample() throws SQLException {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@27.118.22.14:1521:orcl", "SCOTT", "SCOTT");
            statement = con.createStatement();
            System.out.println("Connect database successful!");

            for (int i = 0; i < 20; i++) {
                String name = "Pham Thi Thuy " + i;
                int age = 10 + i;

            }
            statement.executeBatch();

            ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM FUN_STUDENT");
            if (rs.next()) System.out.println("total records = " + rs.getInt(1));
            System.out.println("success!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            con.close();
        }
    }
}
