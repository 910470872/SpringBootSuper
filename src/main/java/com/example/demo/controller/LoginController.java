package com.example.demo.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fly on 2018/10/29.
 */
@RestController
@RequestMapping("login")
public class LoginController  {

    @RequestMapping("/userLogin")
    public Object userLogin(User user)
    {


        return 1;
    }
}
