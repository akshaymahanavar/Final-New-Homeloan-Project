package com.wearefighters.homeloan.app.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wearefighters.homeloan.app.model.Cibil;
import com.wearefighters.homeloan.app.servicei.CibilServiceI;
@CrossOrigin("*")
@RestController
@RequestMapping(value="/cibil")
public class CibilController 
{
	@Autowired private CibilServiceI cibilservicei;

	
	//generate CibilScore
	 @GetMapping("/cibilscore")
	 public Integer getcibil()
	   {
		Random random=new Random();
		Integer ran=random.nextInt(700,800);
	    return  ran;
	   }
	
	
	
@PostMapping(value="/sendchecklist/{formno}")	
public ResponseEntity<Cibil> postcibildata(@PathVariable Integer formno,@RequestBody Cibil cibil)
{
return new ResponseEntity<>(cibilservicei.postcibildata(formno,cibil),HttpStatus.CREATED) ; 
}



@GetMapping(value="/getchecklists/approve")
public Iterable<Cibil>getchecklistapprove()
{
 return cibilservicei.getchecklistapprove();
}
@GetMapping(value="/getchecklists/reject")
public Iterable<Cibil>getchecklistreject()
{
 return cibilservicei.getchecklistreject();
}
}
