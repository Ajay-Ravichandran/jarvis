package com.aj;

import org.springframework.stereotype.Component;

@Component("sampleCoach") //spring will automatically register this bean with the container
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practice volley";
    }
}
