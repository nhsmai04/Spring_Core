package com.example.spring_aop_jdbc_demo.aop;

import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
@Component
public class LoggingAspect {
	@Before("execution(* com.example.spring_aop_jdbc_demo.service.*.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("[AOP] Before method: " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.example.spring_aop_jdbc_demo.service.*.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("[AOP] After method: " + joinPoint.getSignature().getName());
    }
}