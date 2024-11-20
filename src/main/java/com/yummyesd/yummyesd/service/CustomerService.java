package com.yummyesd.yummyesd.service;

import com.yummyesd.yummyesd.dto.CustomerRequest;
import com.yummyesd.yummyesd.dto.CustomerResponse;
import com.yummyesd.yummyesd.entity.Customer;
import com.yummyesd.yummyesd.mapper.CustomerMapper;
import com.yummyesd.yummyesd.repo.CustomersRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private final CustomersRepo customersRepo;
    private final CustomerMapper customerMapper;

    public CustomerService(CustomersRepo customersRepo, CustomerMapper customerMapper) {
        this.customersRepo = customersRepo;
        this.customerMapper = customerMapper;
    }

    public CustomerResponse addCustomer(CustomerRequest customerRequest) {
        Customer customer = customerMapper.toEntity(customerRequest);
        Customer savedCustomer = customersRepo.save(customer);
        return customerMapper.toCustomerResponse(savedCustomer);
    }

    public List<CustomerResponse> getAllCustomers() {
        return customersRepo.findAll().stream()
                .map(customerMapper::toCustomerResponse)
                .collect(Collectors.toList());
    }

    public void deleteCustomer(int id) {
        customersRepo.deleteById(id);
    }
}
