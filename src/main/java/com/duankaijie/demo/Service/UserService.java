package com.duankaijie.demo.Service;

import com.duankaijie.demo.entity.User;
import com.duankaijie.demo.event.MyEvent;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User getUser(Long id);

    List<User> getAll();

    User getUserByName(String name);

    User getUser(Long id, String name);

    void insertUser(User user);
    void deleteUser(Long id);
    void updateUser(User user);

     User getUser2();








}