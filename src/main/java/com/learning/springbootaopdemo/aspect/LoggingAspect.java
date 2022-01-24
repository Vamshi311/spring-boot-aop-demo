package com.learning.springbootaopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    
    /*
    defined the pointcut expression in mypointcuts.CustomPointcuts class.
     */
    @Before("com.learning.springbootaopdemo.mypointcuts.CustomPointcuts.getBooks()")
    public void before(JoinPoint joinPoint) {
        
        System.out.println(" Before retrieving the books : @before : " + joinPoint.getSignature().getName());
    }

    /*
    defined the pointcut expression in mypointcuts.CustomPointcuts class.
     */
    @Before("com.learning.springbootaopdemo.mypointcuts.CustomPointcuts.serviceMethods()")
    public void beforeServiceMethods(JoinPoint joinPoint) {

        System.out.println(" Before executing service methods @before : " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.learning.springbootaopdemo.dao.BookDAO.getBooks())")
    public void after(JoinPoint joinPoint) {

        System.out.println(" After retrieving the books : @after : " + joinPoint.getSignature().getName());
    }

    @Around("execution(* com.learning.springbootaopdemo.dao.BookDAO.getBooks())")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println(" before retrieving the books : @around : " + proceedingJoinPoint.getSignature().getName());
        Object retVal = proceedingJoinPoint.proceed();

        System.out.println(" after retrieving the books : @around : " + proceedingJoinPoint.getSignature().getName());
        return retVal;
    }
}
