package com.rolin.blogapi.controller;

import com.alibaba.fastjson.JSONObject;
import com.rolin.blogapi.entity.User;
import com.rolin.blogapi.jsonMap.user.Register;
import com.rolin.blogapi.mapper.UserMapper;
import com.rolin.blogapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @PostMapping("/register")
    public JSONObject register(@RequestBody Register json) {
        JSONObject ret = new JSONObject();
        try {
            User user = userService.register(json.getEmail(), json.getUsername(), json.getPassword());
            ret.put("success", true);
            ret.put("user", user);
        } catch (Exception e) {
            ret.put("success", false);
            ret.put("exc", e.getMessage());
        }
        return ret;
    }

    @GetMapping("/all")
    public List<User> getAllUser() {
        List<User> res = userService.getAllUsers();
        for (User user : res) {
            System.out.println(user.toString());
        }
        return userService.getAllUsers();
    }
}
