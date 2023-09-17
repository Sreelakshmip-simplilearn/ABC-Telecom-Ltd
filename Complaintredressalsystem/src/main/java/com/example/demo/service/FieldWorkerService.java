package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.FieldWorker;

@Service
public interface FieldWorkerService {
FieldWorker savefieldworker(FieldWorker fieldworker);
void deletefieldworker(int Fieldworkerid);
}
