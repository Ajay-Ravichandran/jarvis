package com.aj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
    public static void main(String[] args) {
        //read spring config file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //get the beans

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //call methods
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        //close the container
        context.close();

        //autowiring injection types
        // -constructor injection,setter injection and field injection
        //Development process for constructor injection
        //-Define the dependency interface and class
        //Create constructor in your class for the injection
        //Configure the dependency using @Autowired annotation

        /*
        Setter Injection-
        Inject dependencies by calling setter method
        - create setter methods for injection
        - configure @Autowired annotation

         */
    }
}
