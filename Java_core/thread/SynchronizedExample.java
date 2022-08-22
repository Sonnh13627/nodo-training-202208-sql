package thread;

public class SynchronizedExample {
    public static void main(String[] args) {
        new Thread(new PrintMessage("Say hello to everyone")).start();
    }
}
