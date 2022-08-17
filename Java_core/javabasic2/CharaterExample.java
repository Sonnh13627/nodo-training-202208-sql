package javabasic2;

import java.util.stream.IntStream;

public class CharaterExample {
    private static int countDigit(String value){
        int i=0;
        int counter = 0;
        while (i<value.length()){
            char c = value.charAt(i);
            if (Character.isDigit(c)) counter++;
            i++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println("There are" +countDigit("son") + "digits in the text.");
    }
}
