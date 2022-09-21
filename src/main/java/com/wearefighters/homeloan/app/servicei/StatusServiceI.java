package com.wearefighters.homeloan.app.servicei;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.model.CustomerDetails;
import com.wearefighters.homeloan.app.model.CustomerStatus;


public interface StatusServiceI
{

public CustomerStatus sendstatus(CustomerStatus status, Integer customerid);

public List<CustomerDetails> getapprovedlist();

public List<CustomerDetails> getrejectedlist();

}
