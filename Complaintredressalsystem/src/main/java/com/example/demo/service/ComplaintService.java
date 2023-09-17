package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Complaint;

@Service
public interface ComplaintService {
Complaint saveComplaint(Complaint complaint);
public Complaint updateComplaint(Complaint complaint);
List<Complaint> getallComplaints();
}
