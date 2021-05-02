package com.aj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //spring will automatically register this bean with the container
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

//    @Autowired //spring will scan for a component that implements the fortune service interface
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    //define default constructor

    public TennisCoach() {
        System.out.println("Inside default constructor");
    }

    //creating setter method
    @Autowired
    public void sampleMethod(FortuneService fortuneService) {
        System.out.println("Inside Setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "practice volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
