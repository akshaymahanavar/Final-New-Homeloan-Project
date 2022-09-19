package com.wearefighters.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data 
@Entity
public class Address 
{
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
  private Integer  addrid;
  private String panno;
  private Long adharno;
  private String cityname;
  private String areaname;
  private Long pinno;
	
	

}
