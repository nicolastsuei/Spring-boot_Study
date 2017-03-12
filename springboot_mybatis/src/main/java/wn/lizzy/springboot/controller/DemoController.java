package wn.lizzy.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;

import wn.lizzy.springboot.entity.Demo;
import wn.lizzy.springboot.service.DemoService;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;
   
    @RequestMapping("/likeName")
    public List<Demo> likeName(String name){
    	//第一个参数是第几页；
    	//第二个参数是每页显示条数。
    	PageHelper.startPage(1,1);
       return demoService.likeName(name);
    }
   
}
