import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConjig {
    @Bean(name="bean2")
    @Scope("singleton")
    public HelloClazz getHelloBean(){
       HelloClazz bean = new HelloClazz();
       bean.setMessage("Xin chao lop hoc Java");
       return bean;
    }
}
