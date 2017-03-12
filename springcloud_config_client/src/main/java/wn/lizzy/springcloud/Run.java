package wn.lizzy.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主启动
 * Run.java
 * @author nicolas 2017年3月9日--下午10:57:41
 *
 *
 */
@SpringBootApplication
@RestController
public class Run 
{
	@Value("${foo:sdfsd}")
    String bar;

    @RequestMapping("/")
    String hello() {
        return "Hello " + bar + "!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }
}
