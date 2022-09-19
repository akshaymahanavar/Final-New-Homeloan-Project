package com.wearefighters.homeloan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wearefighters.homeloan.app.model.BankDetail;
import com.wearefighters.homeloan.app.servicei.BankServiceI;

@CrossOrigin("*")
@RestController 
public class BankController 
{
   @Autowired BankServiceI bankservicei;
  
@PostMapping(value ="/sendbankdetail/{customerid}")
public ResponseEntity<BankDetail> sendbankdetail(@RequestBody BankDetail bank,@PathVariable Integer customerid)
{
 return new ResponseEntity<BankDetail>(bankservicei.sendbankdetail(bank,customerid),HttpStatus.OK);
}



}

	
	
	
	
	
	
	


