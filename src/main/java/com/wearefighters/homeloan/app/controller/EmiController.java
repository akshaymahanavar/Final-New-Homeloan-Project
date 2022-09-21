package com.wearefighters.homeloan.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wearefighters.homeloan.app.model.CustomerDetails;
import com.wearefighters.homeloan.app.model.Emi;
import com.wearefighters.homeloan.app.servicei.EmiServiceI;


@CrossOrigin("*")
@RestController
public class EmiController
{
	
	@Autowired private EmiServiceI emiservicei;

//post data to database	
@PostMapping(value = "/sendEmidata/{customerid}")
public ResponseEntity<Emi> sendemidata(@RequestBody Emi emi,@PathVariable Integer customerid)
{
return new ResponseEntity<Emi>(emiservicei.sendemidata(emi,customerid),HttpStatus.CREATED);
}

  //get  customer id
@GetMapping(value ="/getEmidata/{customerid}")
public ResponseEntity <CustomerDetails> getemidata(@PathVariable Integer customerid )
{
return new ResponseEntity <CustomerDetails>(emiservicei.getemidata(customerid),HttpStatus.OK);
}

	
	
	
	
	
	

}
