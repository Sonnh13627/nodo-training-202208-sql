package springcore;

import org.springframework.beans.factory.DisposableBean;

import java.util.List;

public class HelloClazz implements DisposableBean {
    private String message;

    private List<JavaClazz> clazzes;
    public HelloClazz() {
    }

    public HelloClazz(int i) {
    }

    public void setMessage(String message) {
        this.message = "Call From Setter"+message;
    }

    public String printMessage(){
        System.out.println("Your Message:"+message);
        return null;
    }
    private void initMessage(){
        System.out.println("Calling init method");
        message = "From init method: Say hello bean!";
    }

    public HelloClazz(HelloClazz clazz) {
        message = clazz.message;
    }
    private void release(){
        message = null;
        System.out.println("Message is null");
    }

    @Override
    public void destroy() throws Exception {
        message = null;
        System.out.println("message is null");
    }

    public String getMessage() {
        return message;
    }
}
