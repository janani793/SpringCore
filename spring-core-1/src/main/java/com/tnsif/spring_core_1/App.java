package com.tnsif.spring_core_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		 
		 vehicle vehicle = (vehicle) context.getBean("vehicleBean");
		 vehicle.ride();
	}

}
 