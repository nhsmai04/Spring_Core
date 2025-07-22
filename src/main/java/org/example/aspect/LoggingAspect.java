package org.example.aspect;



import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Component
public class LoggingAspect {
    @After("execution(* org.example.service.A.m*(..))")
    public void logAfterMMethods(JoinPoint joinPoint) {
        System.out.println("[LOG] Called method: " + joinPoint.getSignature().getName());
    }
}
