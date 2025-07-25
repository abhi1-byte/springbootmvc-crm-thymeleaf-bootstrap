package com.abhi.controller;

import com.abhi.model.Customer;
import com.abhi.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService service;

    @GetMapping("/addForm")
    public String showAddForm(@ModelAttribute("customer") Customer customer) {
        /*@ModelAttribute("customer")
        --> Behind the Scenes ::
            Customer customer = new Customer();
            Adds it to the model using the name "customer" (key you specified in the annotation).
            This makes it available in the request scope (for the current request only).
            The view name "add-form" is returned.
            Thymeleaf (or JSP) accesses the "employee" object in the form using:
           <form th:object="${employee}">
        * */
        return "/customers/customer-form";
    }

    @GetMapping("/list")
    public String getCustomers(Map<String, Object> model) {
        List<Customer> customerList = service.getAllCustomers();
//        customerList.forEach(System.out::println);
        model.put("customerList", customerList);
        return "/customers/list-customers";
    }

    @PostMapping("/addCustomer")
    public String saveOrUpdateCustomer(@ModelAttribute("customer") Customer customer) {
        System.out.println(customer);
        service.addOrUpdateCustomer(customer);
        return "redirect:/customer/list";
    }

    @PostMapping("/updateForm")
    public String showUpdateForm(Map<String, Object> model, @RequestParam Integer customerId) {
        Customer customer = service.getById(customerId);
        model.put("customer", customer);
        return "/customers/customer-form";
    }

    @PostMapping("/delete")
    public String deleteCustomer(@RequestParam Integer customerId) {
        service.removeById(customerId);
        return "redirect:/customer/list";
    }

}
