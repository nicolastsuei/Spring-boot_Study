package wn.lizzy.springboot.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;

/**
 * 注册MyBatis分页插件PageHelper
 * MyBatisConfiguration.java
 * @author nicolas 2017年3月9日--下午8:18:05
 *
 *
 */
@Configuration
public class MyBatisConfiguration {
	@Bean
    public PageHelper pageHelper() {
       System.out.println("MyBatisConfiguration.pageHelper()");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
