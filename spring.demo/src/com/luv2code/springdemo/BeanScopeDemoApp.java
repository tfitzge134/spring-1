package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring conf file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
		//retrieve bean from container(from the xml file
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object" + result);
		System.out.println("\n memory address for coach class is  " + theCoach + " \nmemory address for the alphaCoach  is "
				+ alphaCoach);
		//close context
		context.close();

	}

}
