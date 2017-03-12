package wn.lizzy.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka主启动
 * Run.java
 * @author cuilj  2017年3月10日--上午9:38:17
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class Run 
{
    public static void main( String[] args )
    {
    	 new SpringApplicationBuilder(Run.class).web(true).run(args);
    }
}
