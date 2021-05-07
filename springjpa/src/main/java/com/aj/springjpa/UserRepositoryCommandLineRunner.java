package com.aj.springjpa;

import com.aj.springjpa.entity.User;
import com.aj.springjpa.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class); //logger using slf4j

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        // save the user inside the command line runner
        User user = new User("Jill", "Admin");
        userRepository.save(user); //update or insert - method is save if we use the interface

        // userRepository.findById() - to find by id - the primary key
        // findAll() - returns a list
        //userRepository has a lot of methods
        log.info("new user is created " + user);
    }

}
