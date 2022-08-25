import org.apache.log4j.Logger;

public class HelloWorld {
    private final static Logger LOGGER = Logger.getLogger(HelloWorld.class);
    String message;
    private HelloClazz clazz;
    public void sayHello(){
        clazz.printMessage();
        LOGGER.info("From HelloWorld:"+message);
    }

    public HelloWorld() {
    }

    public void setMessage(String value) {
        this.message = value;
    }
    public HelloWorld(String name,HelloClazz clazz){
        message= "From Hello word constructor:"+name+":"+clazz.getMessage();
    }

    public void setClazz(HelloClazz clazz) {
    }
}
