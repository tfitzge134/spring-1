package com.luv2code.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		//retrieve bean from bean container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//call method on bean
		System.out.println(theCoach.getDailyWorkout());
		//close the context
		context.close();

	}

}
