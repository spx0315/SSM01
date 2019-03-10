package com.spx.dao;

import com.spx.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public List<User> getAllUser();
}
