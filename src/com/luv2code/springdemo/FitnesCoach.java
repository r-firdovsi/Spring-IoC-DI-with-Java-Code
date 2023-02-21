package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("bestFitnesCoach")
public class FitnesCoach implements Coach {
	private FortuneService fortuneService;
	
	public FitnesCoach() {
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "No pain, no gain";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
