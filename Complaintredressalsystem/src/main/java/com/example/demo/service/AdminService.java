package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;

@Service
public interface AdminService {
Admin SaveAdmin(Admin admin);
void deleteAdmin(int AdminNo);
Admin findByadminId(int adminid);
}
