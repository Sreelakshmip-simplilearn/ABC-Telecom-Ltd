package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Complaint;
import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@CrossOrigin (origins="http://localhost:4200")
@RequestMapping("/api/Customer")
@RestController
public class Customercontroller {
public Customercontroller(CustomerService customerservice) {
		super();
		this.customerservice = customerservice;
	}

public CustomerService customerservice;
@PostMapping
public ResponseEntity<Customer>SaveCustomer(@RequestBody Customer customer)
{
	return new ResponseEntity<Customer>(customerservice.SaveCustomer(customer),HttpStatus.CREATED);
}
@GetMapping
public List<Customer> getallCustomer()
{
	return customerservice.getallcustomers();
}
}
