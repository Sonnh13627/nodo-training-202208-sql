package collnection2;

import java.util.ArrayList;
import java.util.List;

public class ConcurrencyExample {
    public static void addData(List list){
        while (true){
            int random = (int) (Math.random() * 100);
            list.add(random);
            System.out.println("addnew date"+random);
            try {
                Thread.sleep(100l);
            }catch (InterruptedException e){
                throw new RuntimeException();
            }
        }
    }

    public static void printDate(List list){
        while (true){
            try {
                System.out.println("============");
                list.forEach(value -> System.out.println("value="  +value));
                Thread.sleep(80l);
            }catch (Exception e){
                e.printStackTrace();
                return;
            }
        }
    }
    public static void main(String[] args) {
        List list = new ArrayList<>();
        new Thread(() -> addData(list)).start();
        new Thread(() -> printDate(list)).start();
    }
}
