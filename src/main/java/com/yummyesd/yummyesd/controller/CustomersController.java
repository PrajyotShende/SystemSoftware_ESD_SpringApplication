package com.yummyesd.yummyesd.controller;

import com.yummyesd.yummyesd.dto.CustomerRequest;
import com.yummyesd.yummyesd.entity.Customer;
import com.yummyesd.yummyesd.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import jakarta.validation.Valid;



@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customer")
public class CustomersController {
    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity <String> addCustomer(@Valid @RequestBody CustomerRequest request) {
        return ResponseEntity.ok(customerService.addCustomer(request));
    }
}
