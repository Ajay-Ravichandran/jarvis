package com.aj.springjpa.service;

import com.aj.springjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { //entity and primary key type

}
