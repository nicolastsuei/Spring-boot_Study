package wn.lizzy.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 分布式Session状态保存
 * RedisSessionConfig.java
 * @author cuilj  2017年3月8日--下午2:14:55
 *
 */
@Configuration
//开启spring session支持
@EnableRedisHttpSession
public class RedisSessionConfig {

}
