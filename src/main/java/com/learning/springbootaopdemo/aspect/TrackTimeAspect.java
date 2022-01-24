package com.learning.springbootaopdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TrackTimeAspect {
    @Around("@annotation(TrackTime)")
    public Object trackTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        long startTime = System.currentTimeMillis();

        Object retVal = proceedingJoinPoint.proceed();
        long endTime = System.currentTimeMillis();
        
        System.out.println(" Execution time for " + proceedingJoinPoint.getSignature().getName() + " is " + (endTime - startTime));
        return retVal;
    }
}
