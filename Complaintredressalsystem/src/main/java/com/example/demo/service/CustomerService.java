package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.demo.model.Customer;
@Service
public interface CustomerService {
Customer SaveCustomer(Customer customer);
void deleteCustomer(int Customerno);
List<Customer> getallcustomers();

}
