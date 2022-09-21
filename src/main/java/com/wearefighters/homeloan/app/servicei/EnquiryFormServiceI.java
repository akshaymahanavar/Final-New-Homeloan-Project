package com.wearefighters.homeloan.app.servicei;

import java.util.Optional;

import com.wearefighters.homeloan.app.model.Cibil;
import com.wearefighters.homeloan.app.model.EnquiryForm;

public interface EnquiryFormServiceI
{

	public EnquiryForm senddata(EnquiryForm enqiuryform);  //post

	public EnquiryForm getdata(Integer id);

	public Iterable<EnquiryForm> getalldata();
	
	public Iterable<EnquiryForm> getchecklistapprove();

	public Iterable<EnquiryForm> getchecklistreject();


//	public void deletedata(Integer id);
//
//	public EnquiryForm updatedata(EnquiryForm enquiryform, Integer id);

}
