package com.example.pp311.dao;

import com.example.pp311.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();

    User getUser(long id);

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(long id);
}