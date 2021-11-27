package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
//load spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");	
		//retrieve bean from container
				CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		//call methods i the bean
				System.out.println(theCoach.getDailyFortune());
				System.out.println(theCoach.getDailyWorkout());
				//System.out.println(theCoach.getRandomFortune());
		//close the context
				System.out.println(theCoach.getEmailAddress());
				System.out.println(theCoach.getTeam());
		context.close();
		

	}

}
