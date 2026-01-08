package com.example.myspringboot.component;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {
    public static final Logger logger = LoggerFactory.getLogger(LoginAspect.class);

    @Pointcut("execution(* com.example.myspringboot.service..*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void logBefore(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object args = joinPoint.getArgs();
        logger.info("成功了", methodName, args);
    }
}
