package com.duankaijie.demo.Dao;

import com.duankaijie.demo.entity.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

/**
 * @author 段凯杰
 * @date 2022/5/17 16:25
 */
public interface UserDao {

    @Select("select * from t_user where username = #{username}")
    User getByUsername(String username);

    @Select("select r.rolename from t_user u,t_role r " +
            "where u.role_id = r.id and u.username = #{username}")
    Set<String> getRoles(String username);

    @Select("select p.permissionname from t_user u,t_role r,t_permission p " +
            "where u.role_id = r.id and p.role_id = r.id and u.username = #{username}")
    Set<String> getPermissions(String username);

}
