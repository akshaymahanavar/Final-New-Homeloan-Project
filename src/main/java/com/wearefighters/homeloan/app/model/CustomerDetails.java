package com.wearefighters.homeloan.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class CustomerDetails 
{
	 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerid;
	private String fullname;
	private Long mobileno;
	private String email;
	private Integer age;
	private Character gender;
	private String dob;
	
@OneToOne(cascade =CascadeType.ALL )
private Address addr;

@OneToOne(cascade =CascadeType.ALL )
private BankDetail bank;

@OneToOne(cascade = CascadeType.ALL)
private Document document;

@OneToOne(cascade =CascadeType.ALL )
private CustomerStatus status;

@OneToOne(cascade = CascadeType.ALL)
private Emi emi;

@OneToOne(cascade = CascadeType.ALL)
private Sanction sanction;

}