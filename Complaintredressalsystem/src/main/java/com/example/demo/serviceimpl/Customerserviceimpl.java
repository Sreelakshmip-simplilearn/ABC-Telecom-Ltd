package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@Service
public class Customerserviceimpl implements CustomerService {
public Customerserviceimpl(CustomerDao customerdao) {
		super();
		this.customerdao = customerdao;
	}

public CustomerDao customerdao;

@Override
public Customer SaveCustomer(Customer customer) {
	
	return customerdao.save(customer);
}

@Override
public void deleteCustomer(int Customerno) {
customerdao.findById(Customerno);
customerdao.deleteById(Customerno);
}

@Override
public List<Customer> getallcustomers() {

	return customerdao.findAll();
}



}
