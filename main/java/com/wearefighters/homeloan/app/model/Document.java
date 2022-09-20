package com.wearefighters.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity
public class Document 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer docid;
	@Lob //application.property(Defined size)
	private  byte[] photo;
	@Lob 
	private  byte[] signature;
	@Lob
	private  byte[] electricbill;
	@Lob
	private  byte[] pancard;
	@Lob
	private  byte[] adharcard;
	@Lob
	private  byte[] propertydocument;
	@Lob
	private  byte[] bankpassbook;
	
	
}
