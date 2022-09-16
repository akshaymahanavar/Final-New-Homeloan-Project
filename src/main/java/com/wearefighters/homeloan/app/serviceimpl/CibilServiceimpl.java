package com.wearefighters.homeloan.app.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.model.Cibil;
import com.wearefighters.homeloan.app.model.EnquiryForm;
import com.wearefighters.homeloan.app.repository.CibilRepository;
import com.wearefighters.homeloan.app.repository.EnquiryRepository;
import com.wearefighters.homeloan.app.servicei.CibilServiceI;



@Service
public class CibilServiceimpl implements CibilServiceI
{
	
	@Autowired private  CibilRepository cibilrepository;
	@Autowired private   EnquiryRepository enquiryrepository;
	
	

	@Override
	public Cibil postcibildata(Integer formno, Cibil cibil)
	{   
		Cibil ci=new Cibil();
		
		
Optional<EnquiryForm> enquiry=enquiryrepository.findById(formno);
           
         if(enquiry.isPresent())
         {
         EnquiryForm enquiryForm = enquiry.get();
        	 
         
              
               ci.setCibilscore(cibil.getCibilscore());         
		       ci.setCibilstatus(cibil.getCibilstatus());
		       ci.setEnquiryform(enquiryForm);
		       
		   return   cibilrepository.save(ci);    
          }
         else {
        	 
        
        	 return null;
         }
		
		
		
	}

}
