package wn.lizzy.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import wn.lizzy.springboot.entity.Demo;

/**
 * MyBatis使用类，这里主要是@select进行使用
 * DemoMapper.java
 * @author nicolas 2017年3月9日--下午8:03:04
 *
 *
 */
public interface DemoMapper {
	@Select("select *from Demo where name = #{name}")
    public List<Demo> likeName(String name);
   
    @Select("select *from Demo where id = #{id}")
    public Demo getById(long id);
   
    @Select("select name from Demo where id = #{id}")
    public String getNameById(long id);
}
