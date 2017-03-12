package wn.lizzy.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller
 * HelloController.java
 * @author nicolas 2017年3月10日--下午10:53:47
 *
 *
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
