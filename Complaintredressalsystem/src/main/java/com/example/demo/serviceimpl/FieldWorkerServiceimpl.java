package com.example.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.dao.FieldWorkerDao;
import com.example.demo.model.FieldWorker;
import com.example.demo.service.FieldWorkerService;

@Service
public class FieldWorkerServiceimpl implements FieldWorkerService {
public FieldWorkerServiceimpl(FieldWorkerDao fieldworkerdao) {
		super();
		this.fieldworkerdao = fieldworkerdao;
	}

public FieldWorkerDao fieldworkerdao;

@Override
public FieldWorker savefieldworker(FieldWorker fieldworker) {
	
	return fieldworkerdao.save(fieldworker);
}

@Override
public void deletefieldworker(int Fieldworkerid) {
	
	fieldworkerdao.findById(Fieldworkerid);
	fieldworkerdao.deleteById(Fieldworkerid);
}
}
