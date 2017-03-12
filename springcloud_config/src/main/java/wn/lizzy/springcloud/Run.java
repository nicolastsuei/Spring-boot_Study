package wn.lizzy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring Cloud Config Server 启动类
 * Run.java
 * @author nicolas 2017年3月9日--下午9:02:07
 *
 *
 */
@SpringBootApplication
//启用Spring Cloud Config Client
@EnableConfigServer
public class Run 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(Run.class, args);
    }
}
