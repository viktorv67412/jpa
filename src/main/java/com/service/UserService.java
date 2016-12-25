package com.service;

import com.dao.UserDao;
import com.model.UsersEntity;

import java.util.List;

public interface UserService {
    List<UsersEntity> addUser(UsersEntity newUser);

    List<UsersEntity> getAllUsers();
}
