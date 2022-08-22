package NetWorking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class HttpHeaderExample {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.youtube.com/");
        URLConnection connection =(HttpURLConnection) url.openConnection();
        System.out.println("http mewthod" + connection.getInputStream());
        Map<String, List<String>> headers = connection.getHeaderFields();
        BiConsumer<String,List<String>> header = (key,value)->{
            System.out.println("Key: "+key+"Values: "+value);
        };
        headers.forEach(header);
    }
}
