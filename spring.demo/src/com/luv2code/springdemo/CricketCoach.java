package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	//create no arg constructor
	
	public CricketCoach() {
		System.out.println("criketcoach esta dentro del constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("criketcoach esta dentro del setter method");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "walk your dog twice a day ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "recite 3 ave marias for suerte" + fortuneService.getFortune();
	}

}
