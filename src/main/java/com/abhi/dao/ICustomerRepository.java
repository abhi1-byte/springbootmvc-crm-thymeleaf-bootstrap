package com.abhi.dao;

import com.abhi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
}
