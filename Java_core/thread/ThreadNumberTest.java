package thread;

import java.util.concurrent.TimeUnit;

public class ThreadNumberTest {
    public static void main(String[] args) throws InterruptedException {
        PrintNumber number = new PrintNumber();
        Thread thread = new Thread(number);
        thread.setName("FSoft_Thread");
        thread.setDaemon(true);
        thread.start();
//      Thread.currentThread().join();
//        while (thread.isAlive()){
//            if (number.getNumber()%10 == 0){
//                number.setAlive(false);
//            }
////            Thread.sleep(1000);
//            TimeUnit.SECONDS.sleep(1);
        System.out.println("Main Thread say hallo");
        System.out.println("Main Thread say goodbye");
        }
    }

