package com.spx.service.impl;

import com.spx.dao.UserDao;
import com.spx.pojo.User;
import com.spx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUser() {
        return userDao.getAllUser();
    }
}
