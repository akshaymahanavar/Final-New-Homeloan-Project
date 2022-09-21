package com.wearefighters.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Emi 
{
	
	 @Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer emid;
	private  Long    loanamount;
	private  Long  interestrate;
	private  Long  loantenure;
	private  Long    totalamount;
	
	
}
