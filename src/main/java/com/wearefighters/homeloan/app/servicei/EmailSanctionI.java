package com.wearefighters.homeloan.app.servicei;

import org.springframework.web.multipart.MultipartFile;

import com.wearefighters.homeloan.app.model.EmailSanction;

public interface EmailSanctionI
{

	public void sendEmailWithAttachment(EmailSanction sanction, MultipartFile f);
}
