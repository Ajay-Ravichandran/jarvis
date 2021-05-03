package com.aj;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{
    // for this however, the bean won't be restFortuneService
    // java uses Java Beans Introspector to generate default bean name
    // injecting with properties = @Value("${foo.email})
    @Override
    public String getFortune() {
        return null;
    }
}
