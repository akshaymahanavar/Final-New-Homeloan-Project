package com.wearefighters.homeloan.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.model.EmailApprove;
import com.wearefighters.homeloan.app.servicei.EmailApproveI;

@Service
public class EmailApproveImpl implements EmailApproveI
{
	

	@Autowired private JavaMailSender jms;

	@Override
	public void sendEmail(EmailApprove emailapprove) 
	{
		
		
		 try {
				SimpleMailMessage smm= new SimpleMailMessage();
				smm.setFrom(emailapprove.getFromEmail());
				smm.setTo(emailapprove.getToEmail());
				smm.setSubject(emailapprove.getSubject());
				smm.setText(emailapprove.getTextBody());
				
				jms.send(smm);
				
			   } 
		 
			catch (Exception e2) 
		     {
				e2.printStackTrace();
				System.out.println("Not sent");
				
			 }
			
			System.out.println("Sent");
		
	   }
		
}
	
	
	
	


