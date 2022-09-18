package com.wearefighters.homeloan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wearefighters.homeloan.app.model.EmailReject;
import com.wearefighters.homeloan.app.servicei.EmailRejectI;
import org.springframework.beans.factory.annotation.Value;


@CrossOrigin("*")
@RestController
@RequestMapping("/mail")
public class EmailRejectController 
{
	@Autowired EmailRejectI emailrejecti;
	
	
     @Value("${spring.mail.username}")
	 String fromEmail;
      
     //send mail
	@PostMapping(value = "/sendEmail/Reject")
	public String sendEmail(@RequestBody EmailReject  emailreject) {
		emailreject.setFromEmail(fromEmail);

		try {
			emailrejecti.sendEmail(emailreject);
		} catch (Exception e2) {
			e2.printStackTrace();
			return "Mail not sent..!";
		}

		return "mail sent successfully...!";
	}
	
	
	

}
