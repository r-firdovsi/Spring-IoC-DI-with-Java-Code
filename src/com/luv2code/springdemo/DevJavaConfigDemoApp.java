package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DevJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring configure file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach theCoach = context.getBean("devCoach", Coach.class);
		
		// call a method
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
	
		
		// close the context
		context.close();
	}

}
