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

import com.example.demo.dao.Admindao;
import com.example.demo.model.Admin;
import com.example.demo.service.AdminService;

@CrossOrigin (origins="http://localhost:4200")
@RequestMapping("/api/Admin")
@RestController

public class Admincontroller {
public Admincontroller(AdminService adminservice) {
		super();
		this.adminservice = adminservice;
	}


public AdminService adminservice;
@PostMapping
public ResponseEntity<Admin> SaveAdmin(@RequestBody Admin admin)
{
	return new ResponseEntity<Admin>(adminservice.SaveAdmin(admin),HttpStatus.CREATED);
}



}

