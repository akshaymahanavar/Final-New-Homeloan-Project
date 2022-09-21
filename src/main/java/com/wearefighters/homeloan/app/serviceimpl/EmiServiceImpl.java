package com.wearefighters.homeloan.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.model.CustomerDetails;
import com.wearefighters.homeloan.app.model.Emi;
import com.wearefighters.homeloan.app.repository.CustomerRepository;
import com.wearefighters.homeloan.app.repository.EmiRepository;
import com.wearefighters.homeloan.app.servicei.EmiServiceI;



@Service
public class EmiServiceImpl  implements EmiServiceI 
{
      @Autowired private EmiRepository emirepository;
	
	  @Autowired private CustomerRepository customerepository;
	    
	    
     @Override
	public Emi sendemidata(Emi emi, Integer customerid)
	{
		  
   Optional<CustomerDetails> optional = customerepository.findById(customerid);
    	 
		  if(optional.isPresent())
		  {
	       
		  CustomerDetails customer=optional.get();   
			   customer.setEmi(emi);
		  
		  emirepository.save(emi);
		  customerepository.save(customer);  
		  
		    return emi;
		   }
		  else {
			  
			  
			return null;  
		  }
		

	}


	@Override
	public CustomerDetails getemidata(Integer customerid) 
	{
		
		
Optional<CustomerDetails> Optional= customerepository.findById(customerid);
				
			 if(Optional.isPresent())
			 {
				 
			CustomerDetails customer= Optional.get();
				 
			 
			return  customer;
				 
			 }
			 else {
				 
				 
				 
			return null; 
			 }
     }
}	
