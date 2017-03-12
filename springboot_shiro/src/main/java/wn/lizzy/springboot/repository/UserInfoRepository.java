package wn.lizzy.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import wn.lizzy.springboot.entity.UserInfo;

/**
 * UserInfo持久化类
 * UserInfoRepository.java
 * @author cuilj  2017年3月8日--下午3:37:10
 *
 */
public interface  UserInfoRepository extends CrudRepository<UserInfo,Long>{
   
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
   
}
