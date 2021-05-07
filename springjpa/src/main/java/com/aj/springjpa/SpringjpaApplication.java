package com.aj.springjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjpaApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringjpaApplication.class, args);
	}

}
/*
Hibernate - ORM framework
it inherits JPA
JPA defines the specification, implemented by hibernate
it is an APi
How it is implemented? - hibernate


command line runner ???
All the magic is happening

h2 - in memory?
mysql , oracle - install them on machine then create tables
lot of setup..
in memory - directly created inside the application
app stops - database is destroyed and removed from memory
no need to install!!

entire magic - spring boot autoconfiguration

 */