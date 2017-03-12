package wn.lizzy.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 主启动程序
 * Run.java
 * @author nicolas 2017年3月9日--下午7:57:42
 *
 *MapperScan的注解，这个是会扫描该包下的接口。
这里我们使用注解的方式进行使用MyBatis，当然您也可以使用xml文件的方式进行使用。
 */
@SpringBootApplication
@MapperScan("wn.lizzy.*.mapper")
public class Run 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(Run.class, args);
    }
}
