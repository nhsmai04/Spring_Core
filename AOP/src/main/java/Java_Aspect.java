import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Java_Aspect {

    @Pointcut("execution(* StudentService.* (..))")
    public void allMethods() {}

    @Before("allMethods()")
    public void logBeforeStudy() {
        System.out.println("[AOP_Java] Before study");
    }

    @After("allMethods()")
    public void logAfter() {
        System.out.println("[AOP_Java] After study");
    }

    @AfterReturning("allMethods()")
    public void logAfterReturning() {
        System.out.println("[AOP_Java] Study method executed successfully");
    }

    @AfterThrowing("allMethods()")
    public void logAfterThrowing() {
        System.out.println("[AOP_Java] Exception occurred during study");
    }

    @Around("allMethods()")
    public Object aroundStudy(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around - Before method");
        try {
            Object result = joinPoint.proceed();
            System.out.println("Around - After method");
            return result;
        } catch (Throwable ex) {
            System.out.println("Around - Caught Exception: " + ex.getMessage());
            throw ex;
        }
    }
}

