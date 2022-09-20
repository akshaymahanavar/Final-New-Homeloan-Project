package com.wearefighters.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class BankDetail 
{
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bankid;
	private Long accountno;
    private String ifsccode;
    private String bankname;
    private String branchcode;

}
