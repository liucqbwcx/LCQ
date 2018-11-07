package com.cast.credit.service.serviceImpl;

import com.cast.credit.mapper.UserMapper;
import com.cast.credit.pojo.User;
import com.cast.credit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUser() {
        List<User> users = userMapper.selectUser();
        System.out.println(users);
        return users;
    }
}
