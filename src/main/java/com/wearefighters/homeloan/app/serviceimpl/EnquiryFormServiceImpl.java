package com.wearefighters.homeloan.app.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.exception.DataNotFoundException;
import com.wearefighters.homeloan.app.exception.DataNotsavedException;
import com.wearefighters.homeloan.app.model.EnquiryForm;
import com.wearefighters.homeloan.app.repository.EnquiryRepository;
import com.wearefighters.homeloan.app.servicei.EnquiryFormServiceI;


@Service // stereotype  
public class EnquiryFormServiceImpl implements EnquiryFormServiceI
{
 
	@Autowired private EnquiryRepository enquiryrepository;
	
     
             //post data      
    @Override   
	public EnquiryForm senddata(EnquiryForm enqiuryform) 
    {	
		 EnquiryForm enq = enquiryrepository.save(enqiuryform);
		 if(enq!=null)
		 {
		  return enq;
		 }
		 else 
		 {
		 throw new DataNotsavedException("Address not saved in database check your input details");
          }
    }

       //get by id (single data fetch)
    
	@Override   
	public EnquiryForm getdata(Integer id) 
	{
	  Optional<EnquiryForm> optional= enquiryrepository.findById(id);
		
	   if( optional.isPresent())
	   {
		 EnquiryForm enquiryform=optional.get();
		   
		return enquiryform;   
	   }
	   else {

		   throw new DataNotFoundException("This  Id  is Not Present in Data Base"); 
	     }
}
      
	//get all data from database
	
	@Override   
	public Iterable<EnquiryForm> getalldata() 
	{
		return enquiryrepository.findAll();
	}

	
	   //approve
    @Override
	public Iterable<EnquiryForm> getchecklistapprove()
	{
		
	   List<EnquiryForm> list=enquiryrepository.findAll();
	
	   List<EnquiryForm> approvelist=new ArrayList<>();
	
	
	for(EnquiryForm enq:list)
	{
	  try {
	  
	         if(enq.getCibil().getCibilstatus().equalsIgnoreCase("approve"))
	         {
		     approvelist.add(enq);
	         }
	      } 
      catch (Exception e) 
      {
	   e.printStackTrace();		
      }
   }
	
return  approvelist;
	}
              //reject
@Override
public Iterable<EnquiryForm> getchecklistreject() 
{
	
	   List<EnquiryForm> list=enquiryrepository.findAll();
		
	   List<EnquiryForm> rejectlist=new ArrayList<>();
	
	
	
	for(EnquiryForm enq:list)
	 {
	  try {
	  
	      if(enq.getCibil().getCibilstatus().equalsIgnoreCase("reject"))
	        {
	    	  rejectlist .add(enq);
	       }
	   } 
    catch (Exception e) 
    {
	  e.printStackTrace();		
    }
  }
	
return  rejectlist;	
}
	
	
	
//delete data from database
//	@Override
//	public void deletedata(Integer id) 
//	{
//		enquiryrepository.deleteById(id);
//		
//	}
//update data from database
//	@Override
//	public EnquiryForm updatedata(EnquiryForm enquiryform, Integer id)
//	{
//	
//	 Optional<EnquiryForm> en=enquiryrepository.findById(id)	; 
//		
//		if(en.isPresent())
//		{
//		
//	    EnquiryForm enquiry=en.get();
//	    
//	     
//	  
//	     enquiry.setFullname(enquiryform.getFullname());
//	     enquiry.setEmail(enquiryform.getEmail());
//	     enquiry.setAge(enquiryform.getAge());
//	     enquiry.setMobileno(enquiryform.getMobileno());
//	     enquiry.setGender(enquiryform.getGender());
//	    
//	    
//	    return  enquiryrepository.save(enquiry);
//	    
//			
//		}
//
//         else {
//       	 
//           System.out.println("Product not Available");	 
//       	 
//           return null;
//        }
 //}
		


	

	
	
}
