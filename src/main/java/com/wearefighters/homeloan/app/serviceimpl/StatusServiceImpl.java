package com.wearefighters.homeloan.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.model.CustomerDetails;
import com.wearefighters.homeloan.app.model.CustomerStatus;
import com.wearefighters.homeloan.app.repository.CustomerRepository;
import com.wearefighters.homeloan.app.repository.StatusRepository;
import com.wearefighters.homeloan.app.servicei.StatusServiceI;

@Service
public class StatusServiceImpl  implements StatusServiceI
{
	
  @Autowired  private StatusRepository statusrepository;
  
  @Autowired  private  CustomerRepository customerrepository;
  
  

@Override
public CustomerStatus sendstatus(CustomerStatus status, Integer customerid) 
{
       
 Optional<CustomerDetails>  customer=customerrepository.findById(customerid);
	                            
	        
	     //CustomerStatus customerstatus=new CustomerStatus();
	  
	     
	  
	   if(customer.isPresent())
	   {
		   
		       CustomerDetails detail = customer.get();
		  
//		       customerstatus.setPersonalstatus(status.getPersonalstatus());
//		       customerstatus.setAddressstatus(status.getAddressstatus());
//		       customerstatus.setBankstatus(status.getBankstatus());
//		       customerstatus.setDocumentstatus(status.getDocumentstatus());
//		       customerstatus.setVerificarion(status.getVerificarion());
//		  
		         detail.setStatus(status);
		  
		   
		    
	      statusrepository.save(status);
		  
	      customerrepository.save(detail)  ;
		    
	       return  status;	  
               }
	       
	          else {
		   
		   
		     return null;   
		   
	        }
	
}

         //Approved

@Override
public List<CustomerDetails> getapprovedlist()
{
	
List<CustomerDetails> customerlist = customerrepository.findAll();
	
     List<CustomerDetails> approvelist=new ArrayList<>();	


	for(CustomerDetails alldetails:customerlist)
	{
	   try 
	    {
		    if(alldetails.getStatus().getVerificarion().equalsIgnoreCase("approved")) 
		     {
			   approvelist.add(alldetails);
		     }
		
	     } 
	   catch (Exception e) 
	   {
		e.printStackTrace();
	   } 
	}
	  
return approvelist ;
}
    
             //Rejected

    @Override
   public List<CustomerDetails> getrejectedlist() 
   {
    	
     List<CustomerDetails> customerlist = customerrepository.findAll();
    	
        List<CustomerDetails> rejectedlist=new ArrayList<>();	


   	for(CustomerDetails alldetails:customerlist)
   	{
   	      try 
   	       {
   		     if(alldetails.getStatus().getVerificarion().equalsIgnoreCase("reject")) 
   		     {
   		       rejectedlist.add(alldetails);
   		     }
   		
   	       } 
   	   catch (Exception e) 
   	    {
   		e.printStackTrace();
   	    } 
   	}
   	  
 return rejectedlist;
   }

}
