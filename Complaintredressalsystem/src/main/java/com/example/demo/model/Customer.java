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
public class Customer {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
int Customerno;
int Customerid;
String Password;
String Customername;
String Typeofconnection;
String Phonenumber;
String Location;
}
