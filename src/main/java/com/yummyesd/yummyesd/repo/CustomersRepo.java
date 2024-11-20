package com.yummyesd.yummyesd.repo;

import com.yummyesd.yummyesd.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepo extends JpaRepository<Customer, Integer> {
//    List<Customers> findByCustomerId(int customerID);
}
