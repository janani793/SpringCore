package com.tnsif.springcoreexample;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
    public static void main( String[] args ){
    	//it is the IOC
    	//it reads and manages the beans
    	ApplicationContext con = new ClassPathXmlApplicationContext("applicationCon.xml");
        
    	Collage College = (Collage)con.getBean("CollageBean");
    	College.show();
    	
    	
    }
}
