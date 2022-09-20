package com.wearefighters.homeloan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wearefighters.homeloan.app.model.Address;
import com.wearefighters.homeloan.app.servicei.AddressServiceI;

@CrossOrigin("*")
@RestController

public class AddressController 
{
	
@Autowired private AddressServiceI addressservicei;



@PostMapping(value ="/sendAddress/{customerid}")
public ResponseEntity<Address> sendaddress(@RequestBody Address addr,@PathVariable Integer customerid )
{
return  new ResponseEntity<>(addressservicei.sendaddress(addr,customerid),HttpStatus.OK);
}
	
	
	

}
