package controller;

import beans.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.JsonUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*@Controller*/
@RestController
public class UserController {

    @RequestMapping("/test1")
    /* @ResponseBody*/
    public String test1() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User(1, "张三", "男");
        return objectMapper.writeValueAsString(user);
    }

    @RequestMapping("/test2")
    public String test2() throws JsonProcessingException {
        List<User> users = new ArrayList<>();
        User user1 = new User(1, "张三", "男");
        User user2 = new User(1, "李四", "女");
        User user3 = new User(1, "王五", "男");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return JsonUtil.getTime(users);
    }

    @RequestMapping("/time")
    public String test3(){
       return JsonUtil.getTime(new Date());
    }

}
