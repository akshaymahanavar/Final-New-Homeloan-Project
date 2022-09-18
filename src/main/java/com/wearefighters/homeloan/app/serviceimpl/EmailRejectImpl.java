package com.wearefighters.homeloan.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.model.EmailReject;
import com.wearefighters.homeloan.app.servicei.EmailRejectI;

@Service
public class EmailRejectImpl  implements EmailRejectI
{
	
	@Autowired JavaMailSender javamailsender;
	

	@Override
	public void sendEmail(EmailReject emailreject) 
	{
		
               try {
				SimpleMailMessage smm= new SimpleMailMessage();
				smm.setFrom(emailreject.getFromEmail());
				smm.setTo(emailreject.getToEmail());
				smm.setSubject(emailreject.getSubject());
				smm.setText(emailreject.getTextBody());
				
				javamailsender.send(smm);
				
			   } 
			catch (Exception e2) {
				e2.printStackTrace();
				System.out.println("Not sent");
			}
			
			System.out.println("Sent");
		}
		
	}
	
	
	


