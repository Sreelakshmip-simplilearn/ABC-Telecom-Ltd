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
public class Engineer {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
int Engineerno;
int Engineerid;	
String Password;
}
