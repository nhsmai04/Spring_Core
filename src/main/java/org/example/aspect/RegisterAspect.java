package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RegisterAspect {
    @Pointcut("execution(* org.example.service.A.m*(..))")
    public void registerUserPointcut() {}

    @Before("registerUserPointcut()")
    public void logAfterMMethods(JoinPoint joinPoint) {
        System.out.println("[LOG] Register method: " + joinPoint.getSignature().getName());
    }
}
