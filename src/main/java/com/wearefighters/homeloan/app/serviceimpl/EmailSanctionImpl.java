package com.wearefighters.homeloan.app.serviceimpl;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.wearefighters.homeloan.app.model.EmailSanction;
import com.wearefighters.homeloan.app.servicei.EmailSanctionI;



@Service
public class EmailSanctionImpl implements EmailSanctionI
{
	

	@Autowired private JavaMailSender jms;

	@Override
	public void sendEmailWithAttachment(EmailSanction sanction, MultipartFile f) 
	{
		MimeMessage mm=jms.createMimeMessage();
		
		
		try {
			
			MimeMessageHelper mmh=new MimeMessageHelper(mm,true);
			
			mmh.setFrom(sanction.getFromEmail());
			mmh.setTo(sanction.getToEmail());
			mmh.setSubject(sanction.getSubject());
			mmh.setText(sanction.getTextBody());
			
			mmh.addAttachment(f.getOriginalFilename(), f);
			
			jms.send(mm);
			
			
		    } 
		catch (Exception e) 
		{
			
			e.printStackTrace();
			System.out.println("Not Sent");
		} 
		
		System.out.println("Mail Sent");
     } 

}
	
	
	
	


