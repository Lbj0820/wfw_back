package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 전체 조회
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    // 저장
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // 로그인
    public User login(String usrnm, String pwd) {
        return userRepository.findByUsrnmAndPwd(usrnm, pwd);
    }
}