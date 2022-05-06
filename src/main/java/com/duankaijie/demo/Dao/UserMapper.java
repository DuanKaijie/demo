package com.duankaijie.demo.Dao;

import com.duankaijie.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Set;

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

    @Insert("insert into user (id, user_name, password) values (#{id}, #{username}, #{password})")
    Integer insertUser(User user);

    @Update("update user Set password = #{password} where user_name = #{username} ")
    Integer updateUser(User user);



    @Delete("delete from user where id = #{id} ")
    void deleteUser(long id);


    // 使用xml方式
    User getUserByName(String username);
}
