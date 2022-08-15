import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ConcurrencyTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,1,3,4,2,3,6,3,3,8);
        System.out.println("Before remove: size of list =" +list.size());
        for (int i = 0; i < list.size();i++){
            if (list.get(i)==3){
                list.remove(i);
            }
        }
        System.out.println("After remove: size of list =" +list.size());
        Iterator<Integer> iterator =  list.iterator();
        while (iterator.hasNext()){
            if (iterator.next() == 3){
                iterator.remove();
            }
        }
        System.out.println("After remove: size of list =" +list.size());
        list.removeIf(item -> {return  item == 3;});
        System.out.println(Collections.singleton(iterator));
        list.removeAll(Collections.singleton(3));
    }
}
