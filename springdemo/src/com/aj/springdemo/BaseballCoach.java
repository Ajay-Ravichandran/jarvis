package com.aj.springdemo;

public class BaseballCoach implements Coach {

    //private field for dependency
    private FortuneService fortuneService;

    //defining constructor for DI
    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 min in baseball";
    }

    @Override
    public String getDailyFortune() {
        //use fortune service
        return fortuneService.getFortune();
    }
}
