package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
//need no arg contructor to run MyApp
	public TrackCoach() {
		
	}
// private field
	private FortuneService fortuneService;
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return " Thanksgiving workout" + fortuneService.getFortune();
	}

}
