package wn.lizzy.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * 
 * Run.java
 * @author nicolas 2017年3月10日--下午11:03:27
 *
 *
 */
@SpringBootApplication
public class Run 
{
    public static void main( String[] args )
    {
    	 new SpringApplicationBuilder(Run.class).web(true).run(args);
    }
}
