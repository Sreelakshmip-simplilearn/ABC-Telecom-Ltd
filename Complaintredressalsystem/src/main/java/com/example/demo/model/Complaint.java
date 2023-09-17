package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Complaint {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int complaintid;
	String typeofconnection;
	int Customerno;
	int pin;
	String complaint;
	String statusofticket;
	int Engineerno;
	int Fieldworkerno;
}
