package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.User;

public interface UserRepository extends JpaRepository<User, String> {

    // 로그인용
    User findByUsrnmAndPwd(String usrnm, String pwd);
}