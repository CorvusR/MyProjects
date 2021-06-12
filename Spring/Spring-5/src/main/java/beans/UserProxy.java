package beans;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class UserProxy {

    @Pointcut(value = "execution(* beans.User.yell(..))")
    public void pointcut(){};

    @Around(value = "pointcut()")
    public void before(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.print("芜-------");
        proceedingJoinPoint.proceed();
        System.out.println("---------");

    }
}
