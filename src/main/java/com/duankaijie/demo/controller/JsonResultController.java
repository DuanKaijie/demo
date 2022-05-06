package com.duankaijie.demo.controller;

/**
 * @version 1.0
 * @author： 段凯杰
 * @date： 2022-04-14 15:55
 */

import com.duankaijie.demo.entity.Result;
import com.duankaijie.demo.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jsonresult")
public class JsonResultController {

    @RequestMapping("/user")
    public Result<User> getUser() {

        User user = new User(1, "倪升武", "123456");
        return new Result<>(user);
    }

    @RequestMapping("/list")
    public Result<List> getUserList() {
        List<User> userList = new ArrayList<>();

        User user1 = new User(1, "倪升武", "123456");
        User user2 = new User(2, "达人课", "123456");
        userList.add(user1);
        userList.add(user2);
        return new Result<>(userList, "获取用户列表成功");
    }

    @RequestMapping("/map")
    public Result<Map> getMap() {
        Map<String, Object> map = new HashMap<>(3);

        User user = new User(1, "倪升武", null);
        map.put("作者信息", user);
        map.put("博客地址", "http://blog.itcodai.com");
        map.put("CSDN地址", null);
        map.put("粉丝数量", 4153);
        return new Result<>(map);
    }
}
