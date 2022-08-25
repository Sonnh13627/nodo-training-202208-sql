import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConjig.class);
        ctx.refresh();
        HelloClazz myBean = (HelloClazz) ctx.getBean("bean2");
        myBean.printMessage();
        System.out.println(myBean);
    }
}