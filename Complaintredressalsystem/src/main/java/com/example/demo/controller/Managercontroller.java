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

import com.example.demo.model.Customer;
import com.example.demo.model.Manager;
import com.example.demo.service.ManagerService;
@CrossOrigin (origins="http://localhost:4200")
@RequestMapping("/api/Manager")
@RestController
public class Managercontroller {
public Managercontroller(ManagerService managerservice) {
		super();
		this.managerservice = managerservice;
	}

public ManagerService managerservice;

@PostMapping
public ResponseEntity<Manager>SaveManager(@RequestBody Manager manager)
{
	return new ResponseEntity<Manager>(managerservice.SaveManager(manager),HttpStatus.CREATED);
}
@GetMapping
public List<Manager> getallManager()
{
	return managerservice.getallmanager();
}
}


