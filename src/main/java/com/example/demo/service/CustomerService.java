package com.example.demo.service;

import com.example.demo.model.*;

import java.util.List;

public interface CustomerService {
    List<Customer> listCustomer();
    Customer saveOrUpdateCustomer (Customer customer);
    Customer getIdCustomer (int id);
    void deleteCustomer (int id);
}
