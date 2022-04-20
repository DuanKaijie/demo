package com.duankaijie.demo.Dao;

import com.duankaijie.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from user where id = #{id}")
    @Results({
            @Result(property = "username", column = "user_name"),
            @Result(property = "password", column = "password")
    })
    User getUser(Long id);

    @Select("select * from user where id = #{id} and user_name=#{name}")
    User getUserByIdAndName(@Param("id") Long id, @Param("name") String username);

    @Select("select * from user")
    List<User> getAll();

    @Insert("insert into user (user_name, password) values (#{username}, #{password})")
    Integer insertUser(User user);

    // 使用xml方式
    User getUserByName(String username);
}
