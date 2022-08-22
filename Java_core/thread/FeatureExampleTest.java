package thread;

import java.sql.ResultSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FeatureExampleTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallablerExample callablerExample = new CallablerExample();
        ExecutorService executors = Executors.newFixedThreadPool(1);
        Future future = executors.submit((Runnable) callablerExample);

        System.out.println("Future Done? "+future.isDone());
       ResultSet result = (ResultSet) future.get();
        System.out.println("Future Done?" +future.isDone()+"-result = " +result);
    }
}
