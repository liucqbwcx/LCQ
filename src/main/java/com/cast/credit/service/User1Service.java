package com.cast.credit.service;

import com.cast.credit.pojo.User1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface User1Service {
    List<User1> selectUser();
    User1 selectByPrimaryKey(Integer id);
    User1 selectOne(User1 user1);
}
