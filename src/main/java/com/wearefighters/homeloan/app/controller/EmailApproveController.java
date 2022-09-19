package com.wearefighters.homeloan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wearefighters.homeloan.app.model.EmailApprove;
import com.wearefighters.homeloan.app.servicei.EmailApproveI;


@CrossOrigin("*")
@RestController
public class EmailApproveController 
{
	
	@Autowired private EmailApproveI emailapprovei;
	
	
	@Value("${spring.mail.username}")
	String fromEmail;

	
	@PostMapping(value = "/sendEmail/Approve")
	public String sendEmail(@RequestBody EmailApprove emailapprove) {
		emailapprove.setFromEmail(fromEmail);

		try {
			emailapprovei.sendEmail(emailapprove);
		     } 
		catch (Exception e2) 
		{
			e2.printStackTrace();
			return "Mail not sent..!";
		}

		return "mail sent successfully...!";
	}
	
	
	
	
	
	
	
	

}
