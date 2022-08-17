package collection;

import java.util.HashMap;
import java.util.Map;

public class MapExampler {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(3, "Nguyễn Hồng Sơn");
        map.put(1, "Nguyễn Thu Hà");
        map.put(2, "Phạm Thị Thủy");
        map.put(4, "Thiều Quang Vinh");
        System.out.println(map.get(3));
        map.put(3, "Nguyễn THị Hương");
        System.out.println(map.get(3));
    }
}
