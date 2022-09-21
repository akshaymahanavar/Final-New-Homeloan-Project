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
import com.wearefighters.homeloan.app.model.CustomerStatus;
import com.wearefighters.homeloan.app.servicei.StatusServiceI;

@CrossOrigin("*")
@RestController
public class StatusController
{

    @Autowired private StatusServiceI statusservicei;

  
   //post data to datatbase
@PostMapping(value = "/sendcutomerstatus/{customerid}")
public  ResponseEntity<CustomerStatus> sendstatus(@RequestBody CustomerStatus status,@PathVariable Integer customerid)
{
return  new ResponseEntity<CustomerStatus>(statusservicei.sendstatus(status,customerid),HttpStatus.CREATED);
}

    //getdata only approved
@GetMapping(value = "/getCustomerStatus/Approved")
public  ResponseEntity<List<CustomerDetails>> getapprovedlist()
{
return new ResponseEntity<List<CustomerDetails>>(statusservicei. getapprovedlist(),HttpStatus.OK);
}
  //getdata only reject
@GetMapping (value = "/getCustomerStatus/Rejected")
public ResponseEntity<List<CustomerDetails>>  getrejectedlist()
{
return new ResponseEntity<List<CustomerDetails>>(statusservicei.getrejectedlist(),HttpStatus.OK);
}

}
