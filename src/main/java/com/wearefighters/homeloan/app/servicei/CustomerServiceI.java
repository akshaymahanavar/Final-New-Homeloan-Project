package com.wearefighters.homeloan.app.servicei;

import java.util.List;

import com.wearefighters.homeloan.app.model.CustomerDetails;

public interface CustomerServiceI 
{

public CustomerDetails senddetails(CustomerDetails customer);

public List<CustomerDetails> getalldata();


}
