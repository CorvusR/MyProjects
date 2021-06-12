package controller;

import beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg", "HelloModel");
        return "hello";
    }

    @RequestMapping("/helloAsshole")
    public String helloA(Model model) {
        model.addAttribute("msg", "HelloModel");
        return "hello";
    }

    @RequestMapping("/add/{a}/{b}")
    public String restful(@PathVariable int a, @PathVariable int b, Model model) {
        int result = a + b;
        model.addAttribute("msg", "The result is" + " " + result);
        return "redirect:/hello";
    }

    @RequestMapping("/test1")
    public String test1(@RequestParam("name") String name,Model model) {
        model.addAttribute("msg",name);
        return "hello";
    }

    @RequestMapping("/test2")
    public String test2(User user, Model model) {
        model.addAttribute("msg",user);
        return "hello";
    }



}

