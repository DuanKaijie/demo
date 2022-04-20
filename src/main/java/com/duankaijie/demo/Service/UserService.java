package com.duankaijie.demo.Service;

import com.duankaijie.demo.entity.User;

import java.util.List;

public interface UserService {
    User getUser(Long id);

    List<User> getAll();

    User getUserByName(String name);

    User getUser(Long id, String name);

    void insertUser(User user);
}