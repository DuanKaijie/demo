package com.duankaijie.demo.Service.impl;

import com.duankaijie.demo.Dao.UserMapper;
import com.duankaijie.demo.Service.UserService;
import com.duankaijie.demo.entity.User;
import com.duankaijie.demo.event.MyEvent;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUser(Long id) {
        return userMapper.getUser(id);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    @Override
    public User getUser(Long id, String name) {
        return userMapper.getUserByIdAndName(id, name);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)//此处需要提示异常种类
    public void insertUser(User user) {
        // 插入用户信息
        userMapper.insertUser(user);
        // 手动抛出异常
        //throw new RuntimeException();
    }

    public void updateUser(User user) {
        // 插入用户信息
        userMapper.updateUser(user);
        // 手动抛出异常
        //throw new RuntimeException();
    }

    public void deleteUser(Long id) {
        userMapper.deleteUser(id);
    }

    @Resource
    private ApplicationContext applicationContext;

    /**
     * 发布事件
     * @return
     */
    public User getUser2() {
        User user = new User(1, "段凯杰", "123456");
        // 发布事件
        MyEvent event = new MyEvent(this, user);
        applicationContext.publishEvent(event);
        return user;
    }





}