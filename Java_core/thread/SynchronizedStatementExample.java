package thread;

public class SynchronizedStatementExample {
    public static void main(String[] args) {
        PrintNumber number = new PrintNumber();
        Thread thread1 = new Thread(number);
        thread1.setName("FSoft_thread 1");
        thread1.start();

        Thread thread2 = new Thread(number);
        thread2.setName("FSoft_Thread2");
        thread2.start();
    }
}
