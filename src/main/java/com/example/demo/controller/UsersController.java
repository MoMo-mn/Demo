package com.example.demo.controller;


import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UserService userService;


    @RequestMapping("getUser/{uid}")
    public String GetUser(@PathVariable String uid){
        return userService.Sel(uid).toString();
    }
}
