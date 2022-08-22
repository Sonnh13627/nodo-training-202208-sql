package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public class CallablerExample {
    public static void main(String[] args) throws Exception {
        PrintNumber number = new PrintNumber();
        Callable<Object> value = Executors.callable(number);
        System.out.println("Main say hallo");
        value.call();
        System.out.println("Main say goodbye");
        
    }
}
