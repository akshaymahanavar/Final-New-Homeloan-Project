package com.wearefighters.homeloan.app.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wearefighters.homeloan.app.model.EmailSanction;
import com.wearefighters.homeloan.app.servicei.EmailSanctionI;


@CrossOrigin("*")
@RestController
public class EmailSanctionController
{
	
	@Autowired private EmailSanctionI emailsanctioni;
	
	
	@Value("${spring.mail.username}")
	String fromEmail;


	
	@PostMapping(value = "/sendSanctionWithAttachment", consumes = MediaType.ALL_VALUE)
	public String sendMailWithAttachment(@RequestPart(required = true, value = "Attachment") MultipartFile f,
			@RequestPart("email") String email) throws IOException {

		try {
			EmailSanction sanction = new EmailSanction();
			
			sanction.setFromEmail(fromEmail);
			
			ObjectMapper o = new ObjectMapper();
			EmailSanction Es = o.readValue(email, EmailSanction.class);
			
			 sanction.setToEmail(Es.getToEmail());
			 sanction.setSubject(Es.getSubject());
			 sanction.setTextBody(Es.getTextBody());
			
			 emailsanctioni.sendEmailWithAttachment(sanction,f);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return "Email not sent..!";
	 	}

		return "Mail sent Successfully...!";
	}
	
	
	
	
	
	
	

}
