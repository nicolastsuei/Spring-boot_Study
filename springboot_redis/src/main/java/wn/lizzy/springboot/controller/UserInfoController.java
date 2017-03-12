package wn.lizzy.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wn.lizzy.springboot.entity.UserInfo;
import wn.lizzy.springboot.service.UserInfoService;

/**
 * 控制层
 * UserInfoController.java
 * @author nicolas 2017年3月7日--下午9:13:35
 *
 *
 */
@Controller
public class UserInfoController {
	@Autowired
	UserInfoService userInfoService;
	
	@RequestMapping("/test")
	@ResponseBody
    public  String test(){
		UserInfo loaded = userInfoService.findById(1);
		System.out.println("loaded="+loaded);
		UserInfo cached = userInfoService.findById(1);
		System.out.println("cached="+cached);
		loaded = userInfoService.findById(2);
		System.out.println("loaded2="+loaded);
		return "ok--test--update";	
    }
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(long id){
		userInfoService.deleteFromCache(id);
		return "ok--delete";
    }
	
	 @RequestMapping("/test1")
	 public @ResponseBody String test1(){
		 userInfoService.test();
		 System.out.println("UserInfoController.test1()");
		 return "ok--test1";
     }
}
