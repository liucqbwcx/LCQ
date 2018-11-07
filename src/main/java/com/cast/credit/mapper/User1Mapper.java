package com.cast.credit.mapper;

import com.cast.credit.pojo.User1;
import org.apache.ibatis.annotations.*;

import javax.persistence.SqlResultSetMapping;
import java.util.List;
@Mapper
public interface User1Mapper {
    @Select("select * from user1")
    List<User1> selectUser();

    @Select("select * from user1 where u_id=#{id}")
    @Results({
            @Result(property="uId",column="u_id"),
    })
//  根据id查询
    User1 selectByPrimaryKey(Integer id);
//  查询多少条数据
    @Select("select count(u_id) from user1")
    Integer selectCount();
//  查询是否有这个数据
    @Select("select * from user1 where username = #{username} and password = #{password}")
    @Results({
            @Result(property="uId",column="u_id"),
    })
    User1 selectOne(User1 user1);
//  插入数据
    @Insert("insert into USER1 values(#{uid},#{username},#{password})")
    boolean insert(User1 user1);
//  根据id删除数据
    @Delete("DELETE FROM USER1 WHERE u_id = #{uid} ")
    boolean deleteByPrimaryKey(Integer uid);
//  根据id修改数据
    @Update("update student" +
            "  set username = #{username}," +
            "      password = #{password}" +
            "where u_id = #{uid}")
    void updateByPrimaryKey(User1 user1);
}
