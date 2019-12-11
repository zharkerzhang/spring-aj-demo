package com.zharker.spring.springajdemo.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectPlane {

    @Before("execution(* *.queryProcess(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("name: "+joinPoint.getSignature().getName());
        System.out.println("before execute");
    }
}
