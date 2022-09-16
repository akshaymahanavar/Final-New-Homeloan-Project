package com.wearefighters.homeloan.app.serviceimpl;

import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.model.EnquiryForm;
import com.wearefighters.homeloan.app.repository.EnquiryRepository;
import com.wearefighters.homeloan.app.servicei.HomeServiceI;

@Service // stereotype  
public class HomeServiceImpl implements HomeServiceI
{
  @Autowired private EnquiryRepository enquiryrepository;
	
	          
    @Override    //post data
	public void senddata(EnquiryForm enqiuryform) 
    {
		enquiryrepository.save(enqiuryform);
	}

	@Override   //get by id (single data fetch)
	public Optional<EnquiryForm> getdata(Integer id) 
	{
		return enquiryrepository.findById(id);
	}

	
	@Override   //get all data from database
	public Iterable<EnquiryForm> getalldata() 
	{
		return enquiryrepository.findAll();
	}

	
	@Override   //delete data (single id)
	public void deletedata(Integer id) 
	{
		enquiryrepository.deleteById(id);
		
	}

 	 //update data from database
	@Override
	public EnquiryForm updatedata(EnquiryForm enquiryform, Integer id)
	{
	
	Optional<EnquiryForm> en=enquiryrepository.findById(id)	; 
		
		if(en.isPresent())
		{
		
	       EnquiryForm enquiry=en.get();
		
	     enquiry.setFullname(enquiryform.getFullname());
	     enquiry.setEmail(enquiryform.getEmail());
	     enquiry.setAge(enquiryform.getAge());
	     enquiry.setMobileno(enquiryform.getMobileno());
	     enquiry.setGender(enquiryform.getGender());
	    
	    
	    return  enquiryrepository.save(enquiry);
	    }

         else {
       	 
           System.out.println("Product not Available");	 
       	 
           return null;
        }
		
}

	

	
	
}
