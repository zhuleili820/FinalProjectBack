package com.mercury.FinalProject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercury.FinalProject.http.Response;
import com.mercury.FinalProject.service.AuthService;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping("/checklogin")
    public Response checklogin(Authentication authentication) {
        return authService.checklogin(authentication);
    }

}
