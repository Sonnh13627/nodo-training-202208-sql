import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("son");
        list.add("vinh");
        Collections.addAll(list,args);
        for (int i =0; i < list.size();i++){
            System.out.println("Element at" + i + "is" + "get value from list by index");
        }
    }
}
