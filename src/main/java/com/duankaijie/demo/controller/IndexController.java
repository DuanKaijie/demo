package com.duankaijie.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 段凯杰
 * @date 2022/5/17 16:13
 */


@Controller
public class IndexController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/unauthorized")
    public String unauthorized() {
        return "unauthorized";
    }
}