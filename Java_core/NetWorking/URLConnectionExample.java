package NetWorking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.util.stream.Stream;

public class URLConnectionExample {
    public static void main(String[] args) throws IOException {
        URL url =new URL( "https://www.facebook.com/");
        URLConnection connection = url.openConnection();
        InputStream stream = connection.getInputStream();
        int read;
        byte[] bytes = new byte[100];
        while ((read = stream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,read));
        }
    }
}
