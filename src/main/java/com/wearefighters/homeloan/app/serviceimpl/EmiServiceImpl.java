package com.wearefighters.homeloan.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.exception.DataNotFoundException;
import com.wearefighters.homeloan.app.exception.DataNotsavedException;
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
	public Emi sendemidata(Emi emi,Integer customerid)
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
			  
			throw new DataNotsavedException("Address not saved in database check your input details");
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
			 	 
				 throw new DataNotFoundException("This  Id  is Not Present in Data Base");
				 
	              }
     }
}	
