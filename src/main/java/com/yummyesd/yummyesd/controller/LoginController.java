package com.yummyesd.yummyesd.controller;

import com.yummyesd.yummyesd.service.CustomerService;
import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/auth")
public class LoginController {

    private final CustomerService customerService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam ("User") String username, @RequestParam("Password") String password) {
        return ResponseEntity.ok(customerService.loginCustomer(username, password));
    }
}
