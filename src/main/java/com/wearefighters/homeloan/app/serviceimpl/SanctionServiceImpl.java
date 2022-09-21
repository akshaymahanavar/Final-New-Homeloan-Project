package com.wearefighters.homeloan.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.exception.DataNotsavedException;
import com.wearefighters.homeloan.app.model.CustomerDetails;
import com.wearefighters.homeloan.app.model.Sanction;
import com.wearefighters.homeloan.app.repository.CustomerRepository;
import com.wearefighters.homeloan.app.repository.SanctionRepository;
import com.wearefighters.homeloan.app.servicei.SanctionServiceI;


@Service
public class SanctionServiceImpl implements SanctionServiceI
{

	  @Autowired private SanctionRepository sanctionrepository;
	
	  @Autowired private CustomerRepository customerrepository;
	
	
	  
	              //post
	    @Override
	    public Sanction sendsanctiondata(Sanction status, Integer customerid) 
	    {
		
	       Optional<CustomerDetails> optional = customerrepository.findById(customerid);    
		
		  if(optional.isPresent())
		  {
			
			  CustomerDetails customer = optional.get();
			
		       customer.setSanction(status);
			
		      customerrepository.save(customer);
			
		      sanctionrepository.save(status);
		      
		     return  status; 
			}
		
		  else {
			  
			throw new DataNotsavedException("Address not saved in database check your input details");  
			  
		   }
		
       }

                  //g

		@Override
		public List<CustomerDetails> getsanction()
		{
			
			            
			List<CustomerDetails>   customerlist = customerrepository.findAll();
			
			List<CustomerDetails> list=new ArrayList<>();
			
			for(CustomerDetails details:customerlist)
			{
				
			      try {
				
				       if(details.getSanction().getStatus().equalsIgnoreCase("sanction"))
				         {
					        
				    	       list.add(details);  
					     }
				  
			        } 
			  
			   catch (Exception e) 
			   {
				
				  e.printStackTrace();  
				   
				   
		       }
	}
			
			
 return   list;
    }
	
	
}
