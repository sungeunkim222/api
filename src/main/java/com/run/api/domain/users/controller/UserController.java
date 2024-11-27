package com.run.api.domain.users.controller;

import java.util.List;
import com.run.api.global.dto.user;
import com.run.api.domain.users.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/user")
    public List<user> user() {
        return userService.getUserList();
    }

}