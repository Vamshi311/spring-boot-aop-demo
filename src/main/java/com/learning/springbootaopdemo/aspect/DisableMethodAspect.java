package com.learning.springbootaopdemo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class DisableMethodAspect {

    @Around("@annotation(disableMethod)")
    public Object disableMethodAspect(ProceedingJoinPoint proceedingJoinPoint, DisableMethod disableMethod) throws Throwable {
        if (disableMethod.isEnabled()) {
            log.info("Method {} is enabled", proceedingJoinPoint.getSignature());
            return proceedingJoinPoint.proceed();
        } else {
            log.info("Method {} is disabled", proceedingJoinPoint.getSignature());
            return null;
        }
    }
}
