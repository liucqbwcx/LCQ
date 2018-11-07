package com.cast.credit.controller;

import com.cast.credit.pojo.User;
import com.cast.credit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/query/list")
    public List<User> selectUser(){
        List<User> list = userService.selectUser();
        return list;
    }
}
