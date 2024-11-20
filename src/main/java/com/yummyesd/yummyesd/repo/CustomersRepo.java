package com.yummyesd.yummyesd.repo;

import com.yummyesd.yummyesd.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomersRepo extends JpaRepository<Customer, Integer> {
    Optional<Customer> findByEmailId(String emailId);
}
