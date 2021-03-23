package com.example.SpringSecurity.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.SpringSecurity.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

@Query("SELECT u from user u where u.username=:username")
public User getUserbyUserName(@Param("username") String username);

}
