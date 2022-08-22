package NetWorking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

public class DatagramServerExample implements Runnable{

    public DatagramServerExample() throws SocketException {
        DatagramSocket socket = new DatagramSocket(4445);
        System.out.println("DATA SERVER listening...");
    }
    @Override
    public void run() {
        byte[] bytes = new byte[100];
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(4445);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
        try {
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length);
            socket.receive(packet);
            System.out.println("From client:"+new String(packet.getData(),0,packet.getLength()));
            bytes = "Sercer say hello".getBytes();
            socket.send(new DatagramPacket(bytes,bytes.length,packet.getAddress(),packet.getPort()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            socket.close();
        }
    }

    public static void main(String[] args) throws SocketException {
        new DatagramServerExample();

    }
}
