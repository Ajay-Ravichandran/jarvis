package com.aj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemo {
    public static void main(String[] args) {
        //read spring config file

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        //get the beans

        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        //call methods
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmail());

        System.out.println(theCoach.getTeam());

        //close the container
        context.close();


    }
}
