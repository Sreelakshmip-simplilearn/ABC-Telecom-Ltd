package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.model.FieldWorker;
import com.example.demo.service.FieldWorkerService;

@CrossOrigin (origins="http://localhost:4200")
@RequestMapping("/api/FieldWorker")
@RestController
public class FieldWorkercontroller {
public FieldWorkercontroller(FieldWorkerService fieldworkerservice) {
		super();
		this.fieldworkerservice = fieldworkerservice;
	}

public FieldWorkerService fieldworkerservice;

@PostMapping
public ResponseEntity<FieldWorker>SaveFieldWorker(@RequestBody FieldWorker fieldworker)
{
	return new ResponseEntity<FieldWorker>(fieldworkerservice.savefieldworker(fieldworker),HttpStatus.CREATED);
}
}
