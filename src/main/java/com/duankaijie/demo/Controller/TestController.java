package com.duankaijie.demo.Controller;

import com.duankaijie.demo.Service.UserService;
import com.duankaijie.demo.entity.User;
import com.duankaijie.demo.Service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private UserService userService;

    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @RequestMapping("/getUser/{id}/{name}")
    public User getUser(@PathVariable Long id, @PathVariable String name) {
        return userService.getUser(id, name);
    }

    @RequestMapping("/getall")
    public List<User> getAll() {
        return userService.getAll();
    }

    @RequestMapping("/getUserByName/{name}")
    public User getUserByName(@PathVariable String name) {
        return userService.getUserByName(name);
    }

    /**
     * 正常测试
     * @param user
     * @return
     */
    @PostMapping("/adduser")
    public String addUser(@RequestBody User user) throws Exception {
        if (null != user) {
            userService.insertUser(user);
            return "second successkaijie";
        } else {
            return "false";
        }
    }
}