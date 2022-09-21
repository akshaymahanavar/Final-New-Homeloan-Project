package com.wearefighters.homeloan.app.servicei;

import java.util.List;

import com.wearefighters.homeloan.app.model.CustomerDetails;
import com.wearefighters.homeloan.app.model.Sanction;


public interface SanctionServiceI 
{
 public Sanction sendsanctiondata(Sanction status, Integer customerid);

public List<CustomerDetails> getsanction();
}
