package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.Managerdao;
import com.example.demo.model.Manager;
import com.example.demo.service.ManagerService;
@Service
public class Managerserviceimpl implements ManagerService {
public Managerserviceimpl(Managerdao managerdao) {
		super();
		this.managerdao = managerdao;
	}

public Managerdao managerdao;
	@Override
	public Manager SaveManager(Manager manager) {
	
		return managerdao.save(manager) ;
	}

	@Override
	public void deleteManager(int Managerno) {
		managerdao.findById(Managerno);
		managerdao.deleteById(Managerno);
		
	}

	@Override
	public List<Manager> getallmanager() {
		return managerdao.findAll();
	}

}
