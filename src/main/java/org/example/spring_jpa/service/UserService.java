package org.example.spring_jpa.service;

import org.example.spring_jpa.entity.User;


public interface UserService {

    Iterable<User> getAllUsers();

    User getUserById(Integer id);
    User getUserByFirstName(String firstname);
    User getUserByLastName(String lastname);
    User getUserByEmail(String email);

    User saveUser(User user);
    void deleteUser(User user);
    void deleteUserById(int id);

}
