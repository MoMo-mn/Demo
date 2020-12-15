package com.example.demo.mapper;

import com.example.demo.entity.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    Users Sel(String uid);
}
