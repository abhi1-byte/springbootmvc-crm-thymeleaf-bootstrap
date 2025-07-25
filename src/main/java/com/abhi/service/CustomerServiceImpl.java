package com.abhi.service;

import com.abhi.dao.ICustomerRepository;
import com.abhi.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepository repo;

    @Override
    public List<Customer> getAllCustomers() {
        return repo.findAll();
    }

    @Override
    public void addOrUpdateCustomer(Customer customer) {
        repo.save(customer);
    }

    @Override
    public Customer getById(Integer id) {
        Optional<Customer> optional = repo.findById(id);
        Customer customer = null;
        if (optional.isPresent()) {
            customer = optional.get();
        } else {
            //Not required as in UI you're directly clicking on the existing record to update
            System.out.println("Record not available for the given id ::" + id);
        }
        return customer;
    }

    @Override
    public void removeById(Integer customerId) {
        repo.deleteById(customerId);
    }

}
