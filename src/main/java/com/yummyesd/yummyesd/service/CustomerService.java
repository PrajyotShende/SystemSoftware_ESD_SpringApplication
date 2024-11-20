package com.yummyesd.yummyesd.service;

import com.yummyesd.yummyesd.dto.CustomerRequest;
import com.yummyesd.yummyesd.entity.Customer;
import com.yummyesd.yummyesd.mapper.CustomerMapper;
import com.yummyesd.yummyesd.repo.CustomersRepo;
import org.springframework.stereotype.Service;
import com.yummyesd.yummyesd.login.JWTHelper;
import com.yummyesd.yummyesd.login.EncryptionService;
import lombok.*;
import com.yummyesd.yummyesd.Exception.CustomerException;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomersRepo repo;
    private final CustomerMapper mapper;
    private final EncryptionService encryptionService;
    private final JWTHelper jwtHelper;

    public String addCustomer(CustomerRequest customerRequest) {
        Customer customer = mapper.toEntity(customerRequest);
        customer.setPassword(encryptionService.encode(customer.getPassword()));
        repo.save(customer);
        return "Customer added successfully";
    }

    public Customer loginCustomer(String email) {
        return repo.findByEmailId(email)
                .orElseThrow(() -> new CustomerException("Customer not found"));
    }

    public String loginCustomer(String email, String password) {
        Customer customer = loginCustomer(email);
        if(!encryptionService.validates(password, customer.getPassword())) {
            return "Wrong password or Email";
        }
        return jwtHelper.generateToken(customer.getEmailId());
    }


}
