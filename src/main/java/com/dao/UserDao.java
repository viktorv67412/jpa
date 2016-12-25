package com.dao;

import com.model.UsersEntity;

import java.util.List;

public interface UserDao {
    List<UsersEntity> addUser(UsersEntity newUser);

    List<UsersEntity> getAllUsers();
}
