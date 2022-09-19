package com.wearefighters.homeloan.app.model;

import javax.persistence.Entity;

import lombok.Data;


@Data 
public class EmailApprove 
{
	
	private String toEmail;
	private String fromEmail;
	private String subject;
	private String textBody;
	
	
	
	
	

}
