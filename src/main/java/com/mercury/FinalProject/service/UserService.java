package com.mercury.FinalProject.service;

import com.mercury.FinalProject.bean.User;
import com.mercury.FinalProject.bean.UserProfile;
import com.mercury.FinalProject.dao.UserDao;
import com.mercury.FinalProject.http.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> getAll() {
        return userDao.findAll();
    }

    public Response register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        user.setUserProfiles(new UserProfile(2));

        userDao.save(user);

        return new Response(true);
    }


}

