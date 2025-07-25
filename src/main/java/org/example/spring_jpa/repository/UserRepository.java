package org.example.spring_jpa.repository;

import org.example.spring_jpa.entity.User;
import org.springframework.data.domain.Sort;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;


@Repository
public interface UserRepository extends CrudRepository<User,Integer> {


    User findUserByLastname(String lastname);
    User findUserByFirstname(String lastname);
    User findUserByEmail(String email);
    Iterable<User> findAll(Sort name);
    Void deleteById(int  id);



}
