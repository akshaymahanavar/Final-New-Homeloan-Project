package com.wearefighters.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Sanction 
{
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sanctionid;
    private String status;
    
}
