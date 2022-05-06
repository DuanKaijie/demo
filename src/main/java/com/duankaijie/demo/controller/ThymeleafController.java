package com.duankaijie.demo.controller;

import com.duankaijie.demo.entity.Blogger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @GetMapping("/test404")
    public String test404() {
        return "index";
    }

    @GetMapping("/test500")//此处是异常报错位置
    public String test500() {
        int i = 1 / 0;
        return "index";
    }

    // @GetMapping("/test100")
    // public String test100() {
    //     //int i = 1 / 0;
    //     return "/test1";
    // }

    @GetMapping("/getBlogger")
    public String getBlogger(Model model) {
        Blogger blogger = new Blogger(1L, "段凯杰", "123456");
        model.addAttribute("blogger", blogger);//model相当于在请求域中配置信息
        return "blogger";
    }

    @GetMapping("/getList")
    public String getList(Model model) {
        Blogger blogger1 = new Blogger(1L, "段凯杰", "123456");
        Blogger blogger2 = new Blogger(2L, "张三", "123456");

        List<Blogger> list = new ArrayList<>();
        list.add(blogger1);
        list.add(blogger2);
        model.addAttribute("list", list);
        return "list";
    }
}