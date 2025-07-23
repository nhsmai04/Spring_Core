package org.example.service;

import org.example.dao.UserDAO;
import org.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(User user) {
        userDAO.save(user);
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED,  readOnly = true)
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Transactional(rollbackFor = {Exception.class , Throwable.class})
    public void delete(User user) throws Exception{
        userDAO.delete(user);
        throw new Exception("test");
    }

    @Transactional(propagation = Propagation.NEVER, readOnly = true)
    public User findOne(int id) {
        List<User> users = userDAO.findAll();
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }




}
