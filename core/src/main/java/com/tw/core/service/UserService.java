package com.tw.core.service;

import com.tw.core.dao.UserDao;
import com.tw.core.entity.User;

import java.util.List;

public class UserService {

    public List<User> getUsers() {
        UserDao userDao = new UserDao();
        return userDao.getAllUsers();
    }

}
