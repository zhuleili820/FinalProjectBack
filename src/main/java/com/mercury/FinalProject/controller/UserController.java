package com.mercury.FinalProject.controller;

import com.mercury.FinalProject.bean.User;
import com.mercury.FinalProject.http.Response;
import com.mercury.FinalProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @PreAuthorize("permitAll()")
    @PostMapping
    public Response addUser(@RequestBody User user) {
        return userService.register(user);
    }


}








