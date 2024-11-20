package com.yummyesd.yummyesd.mapper;

import com.yummyesd.yummyesd.dto.CustomerRequest;
import com.yummyesd.yummyesd.dto.CustomerResponse;
import com.yummyesd.yummyesd.entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public Customer toEntity(CustomerRequest request) {
        return Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .age(request.age())
                .emailId(request.email())
                .password(request.password())
                .build();
    }

    public CustomerResponse toCustomerResponse(Customer customer) {
        return new CustomerResponse(customer.getCustomerId(), customer.getFirstName(), customer.getLastName(), customer.getAge(), customer.getEmailId());
    }
}