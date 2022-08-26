package springcore;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        springcore.HelloClazz obj =(springcore.HelloClazz) context.getBean("helloJavaClazz");
//        obj.printMessage();
//        System.out.println(obj);
//        springcore.HelloClazz obj2 =(springcore.HelloClazz) context.getBean("helloJavaClazz");
//        obj2.printMessage();
//        System.out.println(obj2==obj2);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        context.registerShutdownHook();
//        springcore.HelloWorld objw = (springcore.HelloWorld) context.getBean("helloWorld");
//                objw.sayHello();
        JavaClazz clazz = (JavaClazz) context.getBean("jee01");
        Logger LOGGER = Logger.getLogger(JavaClazz.class);
        LOGGER.info("Map Implement is" + clazz.getStudents().getClass());
        LOGGER.info("There are"+clazz.getStudents().size()+"in the class");
//    clazz = (springcore.JavaClazz) context.getBean("HelloJavaClazz");
//    LOGGER.info("Total classes is"+clazz.getClazzes().size);
    }
}
