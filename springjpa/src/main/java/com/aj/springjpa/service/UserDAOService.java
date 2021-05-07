package com.aj.springjpa.service;

import com.aj.springjpa.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository //something which interacts with database
@Transactional //each method transaction
public class UserDAOService { //DAO - Data Access Object

    @PersistenceContext //only things inside persistence context will be tracked by entity manager
    private EntityManager entityManager; // we need someone to manage entities

    public long insert(User user){ //when we want to modify something in db, we need to be inside a transaction
        //open transaction, make the change, and close the transaction
        entityManager.persist(user);
        //entity manager changes will be tracked by Persistence COntext
        return user.getId();

        //Spring data?
        //problem - multiple DAO services has to be implemented,with multiple entity managers
        /*
        Spring Data JPA
         */
    }
}
