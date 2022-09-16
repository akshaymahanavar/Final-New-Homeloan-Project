package com.wearefighters.homeloan.app.servicei;

import java.util.Optional;

import com.wearefighters.homeloan.app.model.EnquiryForm;

public interface HomeServiceI
{

	public void senddata(EnquiryForm enqiuryform);  //post

	public Optional<EnquiryForm> getdata(Integer id);

	public Iterable<EnquiryForm> getalldata();

	public void deletedata(Integer id);

	public EnquiryForm updatedata(EnquiryForm enquiryform, Integer id);

	

}
