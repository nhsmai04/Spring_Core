import org.springframework.context.annotation.*;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("main.java")
public class AppConfig {

    @Bean
    public StudentService studentService() {
        return new StudentService();
    }

    @Bean
    public Java_Aspect myAspect() {
        return new Java_Aspect();
    }
}
