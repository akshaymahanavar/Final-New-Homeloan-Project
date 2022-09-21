package com.wearefighters.homeloan.app.servicei;

import java.util.List;

import com.wearefighters.homeloan.app.model.CustomerDetails;
import com.wearefighters.homeloan.app.model.Emi;

public interface EmiServiceI 
{
 public Emi sendemidata(Emi emi, Integer customerid);

public CustomerDetails getemidata(Integer customerid);

}
