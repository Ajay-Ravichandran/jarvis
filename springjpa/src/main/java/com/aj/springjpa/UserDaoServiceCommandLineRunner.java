package com.aj.springjpa;

import com.aj.springjpa.entity.User;
import com.aj.springjpa.service.UserDAOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    //why command line runner? - we want this to happen at the launch of the application

    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class); //logger using slf4j

    @Autowired
    private UserDAOService userDAOService;

    @Override
    public void run(String... args) throws Exception {
        // save the user inside the command line runner
        User user = new User("Jack", "Admin");
        long insert = userDAOService.insert(user);
        log.info("new user is created " + user);

    }
}
