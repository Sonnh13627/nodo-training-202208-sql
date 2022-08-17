package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExamble2 {
    public static void main(String[] args) {
        String[] values = {"Tu","An","Hoa","Binh"};
        List<String> list = new ArrayList<String>();
        Collections.addAll(list,values);
        Collections.sort(list);
        for (int i = 0; i< list.size();i++){
            System.out.println(list.get(i)+",");
        }
        System.out.println();
        System.out.println("Vi tri thu"+ Collections.binarySearch(list,"Hoa"));
    }
}
