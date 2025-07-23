package org.example.spring_jpa.service;

import org.example.spring_jpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.spring_jpa.repository.UserRepository;



@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getListUser()
    {
        Iterable<User> user1 = userRepository.findAll();
        return user1;
    }
}
