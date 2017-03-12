package wn.lizzy.springboot.service;

import wn.lizzy.springboot.entity.UserInfo;

/**
 * UserInfo服务接口
 * UserInfoService.java
 * @author nicolas 2017年3月7日--下午9:03:11
 *
 *
 */
public interface UserInfoService {
	public UserInfo findById(long id);
	public void deleteFromCache(long id);
	void test();
}
