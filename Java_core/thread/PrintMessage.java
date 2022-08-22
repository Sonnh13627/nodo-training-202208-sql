package thread;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class PrintMessage implements Runnable {
    private String message;

    public PrintMessage(String message) {
        this.message = message;
    }

    @Override
    public synchronized void run() {
        String[] element = message.split("");
        Arrays.stream(element).forEach(ele -> {
            System.out.println(Thread.currentThread().getName() + " print " + ele);
            try {
                //TimeUnit.SECONDS.sleep(1);
                Thread.sleep((int)(Math.random()*3)*1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

}

