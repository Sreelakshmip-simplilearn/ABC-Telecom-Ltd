package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Complaint;

public interface Complaintdao extends JpaRepository<Complaint,Integer> {

}
