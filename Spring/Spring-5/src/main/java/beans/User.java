package beans;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
public class User {
    public void yell(){
        System.out.print("湖");
    }
}
