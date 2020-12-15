package com.example.demo.service;


import com.example.demo.entity.Users;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public Users Sel(String uid){
        return userMapper.Sel(uid);
    }

}
