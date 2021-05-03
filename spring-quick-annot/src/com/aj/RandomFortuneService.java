package com.aj;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings

    private String[] data = {
            "sample1", "sample2", "sample3"
    };
    //Random num generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        //Pick a random element from array
        int index = myRandom.nextInt(data.length); //get a random num based on size of array

        return data[index];
    }
}
