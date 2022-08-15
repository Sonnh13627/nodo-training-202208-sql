import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcurrencyTest2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,1,3,4,2,3,6,3,3,8);

        System.out.println("Before remove: size of list = "+list.size());
        list.forEach(v -> {
            if (v==3) list.remove(v);

        });
        System.out.println("After remove: size of list =" +list.size());
    }
}
