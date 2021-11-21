package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	//define private field x dependency
	private FortuneService fortuneService;
	
	//define a constructor x dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
