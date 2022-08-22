package NetWorking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerExample {

    public SocketServerExample(int serverPort) throws IOException {
        ServerSocket serverSock = new ServerSocket(serverPort);
        System.out.println("Server lisening....");
        while (true){
            try {
                Socket socket = serverSock.accept();
                new Thread(() -> {
                try(InputStream inputStream = new DataInputStream(socket.getInputStream());
                    DataOutputStream output = (DataOutputStream) socket.getOutputStream()
                ) {
                    System.out.println("Client Say"+ ((DataInputStream) inputStream).readUTF());
                    output.writeUTF("Im a socket server");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                }).start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws IOException {
      //  new SocketServerExample(9245);
        Socket socket = new Socket("localhost",9245);
        System.out.println("CLIENT start sending...");
        try (DataInputStream input = (DataInputStream) socket.getInputStream();
             DataOutputStream output = (DataOutputStream) socket.getOutputStream()){
            output.writeUTF("Hello Server");
            System.out.println("Server Say:"+input.readUTF());
        }finally {
            socket.close();
        }
    }
}
