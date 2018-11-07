package com.cast.credit.service.serviceImpl;

import com.cast.credit.mapper.User1Mapper;
import com.cast.credit.pojo.User1;
import com.cast.credit.service.User1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class User1ServiceImpl implements User1Service {
    @Autowired
    User1Mapper user1Mapper;
    @Override
    public List<User1> selectUser() {
        return user1Mapper.selectUser();
    }

    @Override
    public User1 selectByPrimaryKey(Integer id){
        return user1Mapper.selectByPrimaryKey(id);
    }

    @Override
    public User1 selectOne(User1 user1) {
        return user1Mapper.selectOne(user1);
    }

}
