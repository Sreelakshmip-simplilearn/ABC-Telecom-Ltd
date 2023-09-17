package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Manager;

public interface Managerdao extends JpaRepository<Manager,Integer>{

}
