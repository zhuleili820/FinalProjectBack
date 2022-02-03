package com.mercury.FinalProject.dao;

import com.mercury.FinalProject.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
    public User findByUsername(String username);
}