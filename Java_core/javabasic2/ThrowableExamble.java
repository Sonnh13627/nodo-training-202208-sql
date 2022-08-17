package javabasic2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThrowableExamble {
    public static int toNumber(String value) throws SaiSoException{
        try {
            Integer integer = Integer.parseInt(value);
            return integer.intValue();
        }catch (NumberFormatException e){
            throw new SaiSoException(value);
        }
    }
    private final static Logger LOGGER = Logger.getLogger(ThrowableExamble.class.getName());
    public static void main(String[] args) {
        try {
            System.out.println("number = "+ toNumber("Son"));
        }catch (SaiSoException e){
            LOGGER.log(Level.WARNING,e.getMessage());
        }
    }
}
