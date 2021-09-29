package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.data.relational.core.mapping.Column;

import lombok.Data;

@Data
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "aadhaarNumber"}) })

public class Voter {
	
	@Id
	@GeneratedValue
	private int id ;
	private String name ;
	private int age;
	private long aadhaarNumber;
	  
   
	private boolean status;
	private String location;
}

