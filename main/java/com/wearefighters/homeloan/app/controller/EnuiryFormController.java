package com.wearefighters.homeloan.app.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wearefighters.homeloan.app.model.Cibil;
import com.wearefighters.homeloan.app.model.EnquiryForm;
import com.wearefighters.homeloan.app.servicei.EnquiryFormServiceI;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class EnuiryFormController
{
  @Autowired  private EnquiryFormServiceI enquiryformservice;    
	
	  //post data to data base	
@PostMapping(value ="/sendenquiryform" )
public ResponseEntity<EnquiryForm> senddata(@Valid @RequestBody EnquiryForm enqiuryform)
{
	     
	 	EnquiryForm enq = enquiryformservice.senddata(enqiuryform);	
	 	
	 	if(enq!=null) {
	 		return new ResponseEntity<EnquiryForm>(enqiuryform,HttpStatus.CREATED);
	 	}
	 	return new ResponseEntity<EnquiryForm>(enqiuryform,HttpStatus.BAD_REQUEST);
	 	

}

     //get single data from database
@GetMapping(value = "/getenquiryform/{id}")
public Optional<EnquiryForm> getdata(@PathVariable Integer id)
{
   return enquiryformservice.getdata(id);
}

     //get All data from database
@GetMapping(value ="/getenquiryforms" )
public Iterable<EnquiryForm> getalldata()
{
	return enquiryformservice.getalldata() ;
}

         //Approve
@GetMapping(value="/getchecklists/approve")
 public Iterable<EnquiryForm>getchecklistapprove()
{
 return enquiryformservice.getchecklistapprove();
}
       //Reject
@GetMapping(value="/getchecklists/reject")
public Iterable<EnquiryForm>getchecklistreject()
{
 return enquiryformservice.getchecklistreject();
}



   
  
 //delete to database(single data)
  
//  @DeleteMapping(value = "/delete/{id}")
//  public String deletedata(@PathVariable Integer id)
//  {
//	 enquiryformservice.deletedata(id); 
//  return "Successfully data delete"	;  
//  }
// 
   
   //update data  from database (single form)
  
// @PutMapping(value = "/updateEnquiryform/{id}")
// public EnquiryForm updatedata(@RequestBody EnquiryForm enquiryform,@PathVariable Integer id )
// {
//  return enquiryformservice.updatedata(enquiryform,id );
// }
  
  
  
  
}

