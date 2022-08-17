package javabasic2;

import java.util.Arrays;

public class StreamArrayExample {
    public static void main(String[] args) {
        Integer[] values = {2,3,7,1,3,5,9,11,3};
        Arrays.sort(values,(Integer o1, Integer o2)->{
            return o2-o1;
        });
        for (int i = 0; i < args.length;i++){
            System.out.println(args[i]);
        }
    }
}
