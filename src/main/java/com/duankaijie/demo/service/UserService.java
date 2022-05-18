package com.duankaijie.demo.service;

import com.duankaijie.demo.Dao.UserDao;
import com.duankaijie.demo.entity.User;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

public interface UserService {
    User getUser(Long id);

    List<User> getAll();

    User getUserByName(String name);

    User getUser(Long id, String name);

    void insertUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);

     User getUser2();

    public User getByUsername(String username);

    public Set<String> getRoles(String username);

    public Set<String> getPermissions(String username);



}