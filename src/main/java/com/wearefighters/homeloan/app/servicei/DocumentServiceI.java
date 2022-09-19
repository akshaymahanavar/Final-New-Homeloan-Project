package com.wearefighters.homeloan.app.servicei;

import com.wearefighters.homeloan.app.model.Document;

public interface DocumentServiceI 
{

	public Document senddocument(Document document, Integer customerid);

	public Document getsingledoc(Integer docid);


	
	
	
	

}
