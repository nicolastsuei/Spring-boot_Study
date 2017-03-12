package wn.lizzy.springboot.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import wn.lizzy.springboot.entity.UserInfo;
import wn.lizzy.springboot.repository.UserInfoRepository;

/**
 * UserInfo操作类
 * UserInfoServiceImpl.java
 * @author cuilj  2017年3月8日--下午3:39:05
 *
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{
   
    @Resource
    private UserInfoRepository userInfoRepository;
   
    @Override
    public UserInfo findByUsername(String username) {
       System.out.println("UserInfoServiceImpl.findByUsername()");
       return userInfoRepository.findByUsername(username);
    }
}
