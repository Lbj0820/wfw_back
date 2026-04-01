package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // 전체 조회
    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    // 회원 생성
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    // 로그인
    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return userService.login(user.getUsrnm(), user.getPwd());
    }
}