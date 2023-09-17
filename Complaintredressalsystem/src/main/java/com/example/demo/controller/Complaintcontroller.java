package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Admin;
import com.example.demo.model.Complaint;

import com.example.demo.service.ComplaintService;

@CrossOrigin (origins="http://localhost:4200")
@RequestMapping("/api/Complaint")
@RestController
public class Complaintcontroller {
	public Complaintcontroller(ComplaintService complaintservice) {
		super();
		this.complaintservice = complaintservice;
	}

	public ComplaintService complaintservice;
	
	@PostMapping
	public ResponseEntity<Complaint> SaveComplaint(@RequestBody Complaint complaint)
	{
		return new ResponseEntity<Complaint>(complaintservice.saveComplaint(complaint),HttpStatus.CREATED);
	}
@GetMapping
	public List<Complaint> getallCompliants()
	{
		return complaintservice.getallComplaints();
	}
@PutMapping

public Complaint updatecomplaint(@RequestBody Complaint complaint)
{
return complaintservice.updateComplaint(complaint);
}

}

