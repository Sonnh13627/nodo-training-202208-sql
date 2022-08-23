package jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class DataAccessTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataAccessLogic data= new DataAccessLogic();
//        List<String> names = new ArrayList<>();
//        names = data.loadNames(1);
//        names.forEach(System.out::println);


//        System.out.println("total page ="+data.numberOfPage());


        IntStream.range(1, data.numberOfPage()+1).forEach(page->{
            System.out.println("=============================="+page);
            List<String> names = new ArrayList<>();
            try {
                names= data.loadNames(page);
                System.out.println(names);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
