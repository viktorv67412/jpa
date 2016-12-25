package com.service;

import com.dao.UserDao;
import com.model.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<UsersEntity> addUser(UsersEntity newUser) {
        return userDao.getAllUsers();
    }

    public List<UsersEntity> getAllUsers() {
        return userDao.getAllUsers();
    }
}
