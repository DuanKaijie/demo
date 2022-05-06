package com.duankaijie.demo.controller;

import com.duankaijie.demo.Service.UserService;
import com.duankaijie.demo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "Swagger2 在线接口文档")
public class DateBaseController {

    @Resource
    private UserService userService;

    @GetMapping("/getUser/{id}")
    @ApiOperation(value = "根据用户唯一标识获取用户信息")
    public User getUser(@PathVariable @ApiParam Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/getUser")
    @ApiOperation(value = "根据用户唯一标识获取用户信息")
    public User getUserById(@RequestParam Long id) {
        return userService.getUser(id);
    }

    @GetMapping("/getUser/{id}/{name}")
    public User getUser(@PathVariable Long id, @PathVariable String name) {
        return userService.getUser(id, name);
    }

    @GetMapping("/getall")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/getUserByName/{name}")
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

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "success";
    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestBody User user){
        userService.updateUser(user);
        return "success";
    }

}