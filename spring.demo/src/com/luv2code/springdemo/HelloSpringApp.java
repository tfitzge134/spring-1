package com.luv2code.springdemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from bean container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		//call method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		RandomFortuneService random = 
			context.getBean("myRandomFortune",RandomFortuneService.class);
System.out.println(random.getFortune() + " --random luck printed ")	;
		
		
//		</bean>
//	    <bean id="myRandomFortune"
//	          class="com.luv2code.springdemo.RandomFortuneService"> 
	       			
		
	
	
		//close the context
		context.close();

	}

}
