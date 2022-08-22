package thread;

public class MultiThreadExample {
    public static void main(String[] args) {
        PrintMessage message = new PrintMessage("Say hallo to everyone");
        new Thread(message).start();
    }
}
