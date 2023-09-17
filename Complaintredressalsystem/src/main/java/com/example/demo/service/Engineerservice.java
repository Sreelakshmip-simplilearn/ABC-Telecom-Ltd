package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Engineer;
import com.example.demo.model.Manager;

@Service
public interface Engineerservice {
Engineer saveEngineer(Engineer engineer);
void deleteEngineer(int engineerno);
List<Engineer> getallengineer();
}
