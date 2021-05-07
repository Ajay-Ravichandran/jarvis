package com.aj.springjpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Store it as a table User - make it an entity
@Entity
public class User {

    @Id //makes it a primary key
    @GeneratedValue //generated value
    private long id;
    private String name;
    private String role;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
    protected User(){}

    //ideally we wouldn't have id
    //jpa expects a default constructor
    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
