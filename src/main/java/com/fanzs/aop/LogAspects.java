package com.fanzs.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspects {

    @Before("execution(public int com.fanzs.aop.MathCalculator.div(int,int))")
    public void logStart() {
        System.out.println("LogAspects...logBefore");
    }

    @Before("execution(public int com.fanzs.aop.MathCalculator.div(int,int))")
    public void logInit() {
        System.out.println("LogAspects...logInit");
    }

    @Pointcut("@annotation(com.fanzs.aop.LogAnnotation)")
    public void pointCut() {

    }

    @After("pointCut()")
    public void logEnd() {
        System.out.println("LogAspects...logEnd");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("result " + result);
        System.out.println("LogAspects...logAfterReturning");
    }
}
