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
import com.example.demo.model.Engineer;
import com.example.demo.model.Manager;
import com.example.demo.service.Engineerservice;

@CrossOrigin (origins="http://localhost:4200")
@RequestMapping("/api/Engineer")
@RestController
public class Engineercontroller {
	public Engineercontroller(Engineerservice engineerservice) {
		super();
		this.engineerservice = engineerservice;
	}

	public Engineerservice engineerservice;
	
	@PostMapping
	public ResponseEntity<Engineer>SaveEngineer(@RequestBody Engineer engineer)
	{
		return new ResponseEntity<Engineer>(engineerservice.saveEngineer(engineer),HttpStatus.CREATED);
	}
	@GetMapping
	public List<Engineer> getallengineer()
	{
		return engineerservice.getallengineer();
	}
	}

