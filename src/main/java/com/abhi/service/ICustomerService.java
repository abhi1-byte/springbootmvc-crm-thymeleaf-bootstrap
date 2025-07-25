package com.abhi.service;

import com.abhi.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAllCustomers();

    void addOrUpdateCustomer(Customer customer);

    Customer getById(Integer id);

    void removeById(Integer customerId);
}
