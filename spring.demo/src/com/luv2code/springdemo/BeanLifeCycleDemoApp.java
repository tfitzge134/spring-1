package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring conf file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
				
		//retrieve bean from container(from the xml file
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		
		//output
		System.out.println(theCoach.getDailyWorkout());

		//close context
		context.close();

	}

}
