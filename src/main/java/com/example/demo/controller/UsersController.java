package com.example.demo.controller;


import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UserService userService;


    @GetMapping("getUser/{uid}")
    public String GetUser(@PathVariable String uid){
        return userService.Sel(uid).toString();
    }
    @RequestMapping(value = "login/{username}/{password}",method = RequestMethod.GET)
    public boolean login(@PathVariable("username") String username,@PathVariable("password") String password){
        return userService.login(username,password);
    }
}
