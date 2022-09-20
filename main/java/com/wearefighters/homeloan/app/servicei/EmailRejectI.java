package com.wearefighters.homeloan.app.servicei;

import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.model.EmailReject;


public interface  EmailRejectI 
{

	public void sendEmail(EmailReject emailreject);

}
