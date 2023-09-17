package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.Complaintdao;

import com.example.demo.model.Complaint;
import com.example.demo.service.ComplaintService;

@Service
public class ComplaintServiceimpl implements ComplaintService{
	public ComplaintServiceimpl(Complaintdao complaintdao) {
		super();
		this.complaintdao = complaintdao;
	}



	public Complaintdao complaintdao;
	

	@Override
	public Complaint saveComplaint(Complaint complaint) {
		
		return complaintdao.save(complaint);
	}

	

	@Override
	public List<Complaint> getallComplaints() {
		
		return complaintdao.findAll();
	}



	@Override
	public Complaint updateComplaint(Complaint complaint) {
		Integer complaintid=complaint.getComplaintid();
		Complaint cmp=complaintdao.findById(complaintid).get();
		cmp.setComplaint(complaint.getComplaint());
		cmp.setEngineerno(complaint.getEngineerno());
		cmp.setStatusofticket(complaint.getStatusofticket());
		cmp.setTypeofconnection(complaint.getTypeofconnection());
		return complaintdao.save(cmp);
	}
	

	
	

}
