package com.example.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.dao.Admindao;
import com.example.demo.model.Admin;
import com.example.demo.service.AdminService;

@Service
public class Adminserviceimpl implements AdminService {
	public Adminserviceimpl(Admindao admindao) {
		super();
		this.admindao = admindao;
	}

	public Admindao admindao;

	@Override
	public Admin SaveAdmin(Admin admin) {
		return admindao.save(admin);
		
	}

	@Override
	public void deleteAdmin(int AdminNo) {
		admindao.findById(AdminNo);
		admindao.deleteById(AdminNo);
		}

	@Override
	public Admin findByadminId(int adminid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	

}
