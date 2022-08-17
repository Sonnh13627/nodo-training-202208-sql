package javabasic1;

import java.io.UnsupportedEncodingException;

public class StringExample1 {
    public static void main(String[] args) {
    StringExample4();
    }

    public static void StringExample1() {
        String text = "say hello to everyon";
        System.out.println("Length of text is" + text.length());
        System.out.println("Vi tri cua tu hello la" + text.indexOf("hello"));
        System.out.println("cau tu = " + text.substring(4, 8));

        int i = 0;
        while (i<text.length()){
            char c = text.charAt(i);
            if (c == 'h'){
                i++;
                continue;
            };
            System.out.println("Character at"+ i + "is"+c);
        }

    }
    public static void StringExample2(){
        char[] chars = {'h','e','l','l','o'};
        String text = new String(chars);
        System.out.println(text);
        System.out.println("hello java".equals(text));
    }
    public static void StringExample3(){
        String text = "Absolute Value";
        byte[] bytes = text.getBytes();
        System.out.println("Byte values are");
        for (int i = 0; i < bytes.length; i++) {
            System.out.println((int)bytes[i]+",");
        }
    }
    public static void StringExample4(){
        byte[] bytes = { 99 , -58 , -80 , -31 , -69 , -101 , 112 , 44 ,32 ,
                104 , 105 , -31 , -70 ,-65 , 112 , 44 , 32 , 103 , 105 , -31 , -70 , -65 , 116} ;
        try {
            System.out.println(new String(bytes,"utf8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
