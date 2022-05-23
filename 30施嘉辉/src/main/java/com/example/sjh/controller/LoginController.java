package com.example.sjh.controller;

import com.example.sjh.dao.userdao;
import com.example.sjh.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    userdao use;

    @GetMapping("/")
    public String get(){
        return "login";
    }
    @RequestMapping("/user/login")
    public String login(@RequestParam("username")String username, @RequestParam("password")String password, Model model){
        user a=new user(username,password);
        if (use.login(a)==a){
            return "redirect:/msg";
        }
        else {
//            System.out.println(use.login(a));
            model.addAttribute("msg","用户名或密码错误");
            return "login";
        }
    }
}
