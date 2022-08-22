package NetWorking;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.APPEND;

public class HttpConnectionExample {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.youtube.com/");
        URLConnection connection = url.openConnection();
        Path path = Paths.get("test.html");
        File files;
        byte[] bytes = new byte[100];
        int read;
        try (InputStream inputStream = connection.getInputStream();
             OutputStream outputStream = Files.newOutputStream(path, StandardOpenOption.CREATE,APPEND)
        ){
            while ((read = inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,read);
            }

        }finally {
            Desktop desktop = Desktop.getDesktop();
            desktop.open(path.toFile());
        }
    }
}
