package org.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {

    @Before("execution(* org.example.dao.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Log Before: " + joinPoint.toString());
    }

    @After("execution(* org.example.dao.*.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Log After: " + joinPoint.toString());
    }

    @AfterReturning("logPointCut()")
    public void logAfterReturning(JoinPoint joinPoint) {
        System.out.println("Log AfterReturning: " + joinPoint.toString());
    }

    @Pointcut("execution(* org.example.dao.*.*(..))")
    public void logPointCut() {}



}
