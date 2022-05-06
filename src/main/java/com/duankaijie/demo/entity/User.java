package com.duankaijie.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @version 1.0
 * @author： 段凯杰
 * @date： 2022-04-14 15:30
 */
@ApiModel(value = "用户实体类")
public class User {


    @ApiModelProperty(value = "用户唯一标识")
    private Integer id;
    @ApiModelProperty(value = "用户姓名")
    private String username;
    @ApiModelProperty(value = "用户密码")
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User(){

    }


}