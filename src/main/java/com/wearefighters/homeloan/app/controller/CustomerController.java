package com.wearefighters.homeloan.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wearefighters.homeloan.app.model.CustomerDetails;
import com.wearefighters.homeloan.app.servicei.CustomerServiceI;

@CrossOrigin("*")
@RestController
public class CustomerController 
{
	
   @Autowired  private CustomerServiceI customerservicei;

//send data
@PostMapping(value = "/sendcustomerdetails")
public ResponseEntity<CustomerDetails> senddetails(@RequestBody CustomerDetails customer)
{
	
return new ResponseEntity<CustomerDetails>(customerservicei.senddetails(customer),HttpStatus.CREATED);
}

//get All data
@GetMapping(value ="/getalldata")
public ResponseEntity<List<CustomerDetails>>getalldata()
{
return new ResponseEntity<List<CustomerDetails>>(customerservicei.getalldata(),HttpStatus.OK);
}












	

}
