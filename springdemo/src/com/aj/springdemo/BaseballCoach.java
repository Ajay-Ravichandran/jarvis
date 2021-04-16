package com.aj.springdemo;

public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Spend 30 min in baseball";
    }

}
