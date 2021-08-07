package com.SpringSecurity.demoJwt.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class TestController {

    @GetMapping("/all")
    public String allAccess(){
        return "public content (All)";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('User') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public String userAccess(){
        return "User content ( only User)";
    }

    @GetMapping("/mod")
    @PreAuthorize("hasRole('MODERATOR')")
    public String moderatorAccess(){
        return "MODERATOR board ( only MODERATOR)";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess(){
        return "ADMIN board ( only ADMIN)";
    }
}
