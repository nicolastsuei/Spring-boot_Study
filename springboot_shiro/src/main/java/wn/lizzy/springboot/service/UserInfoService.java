package wn.lizzy.springboot.service;

import wn.lizzy.springboot.entity.UserInfo;

public interface UserInfoService {
	/**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
