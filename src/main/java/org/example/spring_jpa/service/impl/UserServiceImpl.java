package org.example.spring_jpa.service.impl;

import org.example.spring_jpa.entity.User;
import org.example.spring_jpa.repository.UserRepository;
import org.example.spring_jpa.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public Iterable<User> getAllUsers()
    {
        return userRepository.findAll(Sort.by(Sort.Direction.ASC,"lastname"));

    }
    @Override
    public User getUserById(Integer id)
    {
        if(userRepository.findById(id).isPresent())
            return userRepository.findById(id).get();
        return null;
    }

    @Override
    public User getUserByLastName(String lastname)
    {
        return userRepository.findUserByLastname(lastname);
    }

    @Override
    public User getUserByFirstName(String firstname)
    {
        return userRepository.findUserByFirstname(firstname);
    }

    @Override
    public User getUserByEmail(String email)
    {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public User saveUser(User user)
    {
        return userRepository.save(user);
    }
    @Override
    public void deleteUser(User user)
    {
        userRepository.delete(user);
    }
    @Override
    public void deleteUserById(int id)
    {
        userRepository.deleteById(id);
    }
}
