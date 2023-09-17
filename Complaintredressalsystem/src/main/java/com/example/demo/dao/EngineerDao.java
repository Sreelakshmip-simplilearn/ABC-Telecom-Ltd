package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Engineer;

public interface EngineerDao extends JpaRepository<Engineer,Integer>{

}
