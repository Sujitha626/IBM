package org.example.demo.model;

public class SwimmingCoach implements Coach {

	private FortuneService fortuneService;

	// constructor injection

	public String getDailyworkOut() {
		// TODO Auto-generated method stub
		return "practice back swimming today";
	}

	public SwimmingCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}