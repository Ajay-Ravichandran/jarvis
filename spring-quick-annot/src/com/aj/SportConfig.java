package com.aj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan("com.aj") - we have defined @Bean
@PropertySource("classpath:sport.properties")
public class SportConfig {
    // define a method to expose the sad fortune service

    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }
    // define bean for swim coach AND inject dependency

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }


}
