package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.demo.model.Manager;
@Service
public interface ManagerService {
	Manager SaveManager(Manager manager);
	void deleteManager(int Managerno );
	List<Manager> getallmanager();

}
