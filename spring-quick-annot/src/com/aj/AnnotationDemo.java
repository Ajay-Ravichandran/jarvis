package com.aj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
    public static void main(String[] args) {
        //read spring config file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //get the beans

        Coach theCoach = context.getBean("sampleCoach", Coach.class);

        //call methods
        System.out.println(theCoach.getDailyWorkout());

        //close the container
        context.close();
    }
}
