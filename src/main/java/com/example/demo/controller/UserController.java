package com.example.demo.controller;

import com.example.demo.entity.EasybuyUser;
import com.example.demo.jpa.UserJpa;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fly on 2018/10/29.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserJpa userJpa;

    @RequestMapping("/selectAll")
    public Object selectAll()
    {
        Map<String,Object> map=new HashMap<String,Object>();
         List<EasybuyUser> list=   userJpa.findAll();
         map.put("list",list);
         return map;
    }
}
