package beans;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(5)
public class PersonProxy {
    @Pointcut(value = "execution(* beans.User.yell(..))")
    public void pointcut(){};

    @Before(value = "pointcut()")
    public void yell2(){
        System.out.println("哈哈哈哈");
    }
}
