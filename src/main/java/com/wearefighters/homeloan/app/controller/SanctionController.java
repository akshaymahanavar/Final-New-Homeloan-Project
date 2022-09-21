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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wearefighters.homeloan.app.model.CustomerDetails;
import com.wearefighters.homeloan.app.model.Sanction;
import com.wearefighters.homeloan.app.servicei.SanctionServiceI;


@CrossOrigin("*")
@RestController
public class SanctionController
{

	@Autowired SanctionServiceI sanctionservicei;
	
	
	
@PostMapping(value ="/sendsanctiondata/{customerid}")
public ResponseEntity<Sanction> sendsanctiondata(@RequestBody Sanction status,@PathVariable Integer customerid)
{
  return new ResponseEntity<Sanction>(sanctionservicei.sendsanctiondata(status,customerid),HttpStatus.CREATED);
}
	
  //get only sanction letter customers	
	
@GetMapping(value ="/getsanctionletter" )
public ResponseEntity<List<CustomerDetails>>getsanction()
{
	
return new ResponseEntity<List<CustomerDetails>>(sanctionservicei.getsanction(),HttpStatus.OK);
}





}
