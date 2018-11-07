package com.cast.credit.controller;

import com.cast.credit.pojo.User;
import com.cast.credit.pojo.User1;
import com.cast.credit.service.User1Service;
import com.cast.credit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class User1Controller {
    @Autowired
    private User1Service user1Service;
    @RequestMapping("/query/list1")
    public List<User1> selectUser(){
        List<User1> list = user1Service.selectUser();
        return list;
    }
    @RequestMapping("/query/list1/{uId}")
    public User1 selectByPrimaryKey(@PathVariable Integer uId){
        System.out.println(uId+".....................");
        return user1Service.selectByPrimaryKey(uId);
    }

    @RequestMapping(value = "/query/list2",params = {"username","password"})
    public User1 selectOne(@RequestParam User1 user1){
        System.out.println(user1.getuId()+"......."+user1.getUsername()+"......"+user1.getPassword());
        return user1Service.selectOne(user1);
    }
    @RequestMapping(value = "/query/list3")
    public User1 add(@RequestBody User1 user1){
        System.out.println(user1.getUsername()+"......."+user1.getPassword()+"......");
        User1 user2 = new User1();
        user2.setUsername(user1.getUsername());
        user2.setPassword(user1.getPassword());
        User1 user11 = user1Service.selectOne(user2);
        System.out.println(user11);
        return user11;
    }
}
