package com.wearefighters.homeloan.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.model.CustomerDetails;
import com.wearefighters.homeloan.app.repository.CustomerRepository;
import com.wearefighters.homeloan.app.servicei.CustomerServiceI;


@Service 
public class CustomerServiceImpl implements CustomerServiceI
{
  
	@Autowired private CustomerRepository customerrepository;
	
	
	@Override
	public CustomerDetails senddetails(CustomerDetails customer)
	{
	  return  customerrepository.save(customer);
	}


	@Override
	public List<CustomerDetails> getalldata() 
	{
		return  customerrepository.findAll();
	}

}
