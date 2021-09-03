package com.rolin.blogapi.service;

import com.rolin.blogapi.entity.User;
import com.rolin.blogapi.mapper.UserMapper;
import com.rolin.blogapi.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public User register(String email, String username, String password) throws Exception {
        User user = new User(username, email, MD5Util.inputPassToFormPass(password), "default", new Date());
        if (userMapper.insertUser(user) == 0) {
            throw new Exception("用户创建失败");
        }
        return user;
    }




}
