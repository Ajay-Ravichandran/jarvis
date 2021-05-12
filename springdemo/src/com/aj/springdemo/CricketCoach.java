package com.aj.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    //adding new fields
    private String emailAddress;
    
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Inside Setter email");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("Inside Setter team");
        this.team = team;
    }

    //create a no arg constructor
    public CricketCoach() {
        System.out.println("Inside no arg constructor");
    }

    //setter injection
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside Setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "practice fast bowling";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
