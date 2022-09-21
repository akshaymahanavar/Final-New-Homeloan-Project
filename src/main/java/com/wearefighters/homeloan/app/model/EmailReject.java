package com.wearefighters.homeloan.app.model;

import lombok.Data;

@Data
public class EmailReject 
{

	private String toEmail;
	private String fromEmail;
	private String subject;
	private String textBody;
	
	
}
