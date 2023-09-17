package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.EngineerDao;

import com.example.demo.model.Engineer;
import com.example.demo.service.Engineerservice;
@Service
public class Engineerserviceimpl implements Engineerservice {
public Engineerserviceimpl(EngineerDao engineerdao) {
		super();
		this.engineerdao = engineerdao;
	}

public EngineerDao engineerdao;

@Override
public Engineer saveEngineer(Engineer engineer) {
	return engineerdao.save(engineer);
}

@Override
public void deleteEngineer(int engineerno) {
	engineerdao.findById(engineerno);
	engineerdao.deleteById(engineerno);
}

@Override
public List<Engineer> getallengineer() {
	
	return engineerdao.findAll();
}
}
