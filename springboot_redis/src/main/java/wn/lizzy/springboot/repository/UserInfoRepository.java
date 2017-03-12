package wn.lizzy.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import wn.lizzy.springboot.entity.UserInfo;

/**
 * UserInfo持久化
 * UserInfoRepository.java
 * @author nicolas 2017年3月7日--下午9:01:09
 *
 *
 */
public  interface  UserInfoRepository extends CrudRepository<UserInfo,Long> {}
