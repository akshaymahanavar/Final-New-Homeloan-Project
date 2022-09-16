package com.wearefighters.homeloan.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wearefighters.homeloan.app.model.EnquiryForm;
import com.wearefighters.homeloan.app.servicei.HomeServiceI;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class EnquiryController
{
  @Autowired  private HomeServiceI homeservice;    
	
	  //post data to data base	
@PostMapping(value ="/sendenquiryform" )
public String senddata(@RequestBody EnquiryForm enqiuryform)
{
    homeservice.senddata(enqiuryform);	
return "Succesfully data save to database";
}

     //get single data from database
@GetMapping(value = "/getenquiryform/{id}")
public Optional<EnquiryForm> getdata(@PathVariable Integer id)
{
   return  homeservice.getdata(id);
}

     //get All data from database
  @GetMapping(value ="/getenquiryforms" )
  public Iterable<EnquiryForm> getalldata()
 {
	return  homeservice.getalldata() ;
 }
  
 //delete to database(single data)
  @DeleteMapping(value = "/delete/{id}")
  public String deletedata(@PathVariable Integer id)
  {
	  homeservice.deletedata(id); 
  return "Successfully data delete"	;  
  }
 
 //update data  from database (single form)
  
 @PutMapping(value = "/updateenquiryform/{id}")
 public EnquiryForm updatedata(@RequestBody EnquiryForm enquiryform,Integer id )
 {
	
	 EnquiryForm e=homeservice.updatedata(enquiryform,id ); 
	 
 return e; 
 }
  
  
  
  
}

