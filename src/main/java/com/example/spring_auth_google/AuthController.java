package com.example.spring_auth_google;

import org.jetbrains.annotations.NotNull;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/auth")
public class AuthController {


    @GetMapping("")
    public Authentication auth(@NotNull Authentication authentication) {
        return authentication;
    }

    @GetMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
