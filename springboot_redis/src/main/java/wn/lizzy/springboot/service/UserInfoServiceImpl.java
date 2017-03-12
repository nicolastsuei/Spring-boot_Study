package wn.lizzy.springboot.service;

import javax.annotation.Resource;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import wn.lizzy.springboot.entity.UserInfo;
import wn.lizzy.springboot.repository.UserInfoRepository;

/**
 * UserInfo数据处理类
 * UserInfoServiceImpl.java
 * @author nicolas 2017年3月7日--下午9:05:58
 *
 *
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Resource
	private UserInfoRepository userInfoRepository;
	@Resource
	private RedisTemplate<String,String> redisTemplate;

	//缓存,这里没有指定key.
	//keyGenerator="myKeyGenerator"
	@Cacheable(value="userInfo")
	@Override
	public UserInfo findById(long id) {
		System.err.println("UserInfoServiceImpl.findById()=========从数据库中进行获取的....id="+id);
		return userInfoRepository.findOne(id);
	}
	
	@CacheEvict(value="userInfo")
	@Override
	public void deleteFromCache(long id) {
		System.out.println("UserInfoServiceImpl.delete().从缓存中删除.");
	}
	
	@Override
	public void test(){
		ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
		valueOperations.set("mykey4", "random1="+Math.random());
		System.out.println(valueOperations.get("mykey4"));
	}
	
}
