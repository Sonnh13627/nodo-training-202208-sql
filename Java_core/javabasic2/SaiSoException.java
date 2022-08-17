package javabasic2;

import java.util.logging.Logger;

public class SaiSoException extends Exception{
    private String so;
    public SaiSoException(String value){
        this.so=value;
    }
    public String getMessage(){
        return "Gia tri \""+so+"\"Khong phai la so!";
    }
}
