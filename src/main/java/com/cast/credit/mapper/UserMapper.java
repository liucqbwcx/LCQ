package com.cast.credit.mapper;

import com.cast.credit.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> selectUser();
    @Select("select * from user where id = #{id}")
    User getUserById(Integer Id);
    @Select("select * from user")
    List<User> getUserList();
}
