package com.luv2code.springdemo;

public class DevCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public DevCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Write code every day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
