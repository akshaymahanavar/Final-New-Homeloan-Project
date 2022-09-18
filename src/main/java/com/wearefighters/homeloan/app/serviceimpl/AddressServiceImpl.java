package com.wearefighters.homeloan.app.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.model.Address;
import com.wearefighters.homeloan.app.model.CustomerDetails;
import com.wearefighters.homeloan.app.repository.AddressRepository;
import com.wearefighters.homeloan.app.repository.CustomerRepository;
import com.wearefighters.homeloan.app.servicei.AddressServiceI;


@Service
public class AddressServiceImpl implements AddressServiceI
{
	
	@Autowired private AddressRepository addresrepository;
     
	@Autowired private CustomerRepository cutomerrepository;
	
	
	@Override
	public Address sendaddress(Address addr, Integer cutomerid)
	{
		
		Address address=new Address();
		
	   Optional<CustomerDetails> customer=cutomerrepository.findById(cutomerid);
		             
	   if(customer.isPresent())
	   {
		 
		  CustomerDetails custo= customer.get(); 
		   
		     
		  address.setPanno(addr.getPanno());
		  address.setAdharno(addr.getAdharno());
		  address.setCityname(addr.getCityname());
		  address.setAreaname(addr.getAreaname());
		  address.setPinno(addr.getPinno());
		  
		    custo.setAddr(address);
		    
		    addresrepository.save(address);
		    cutomerrepository.save(custo);
		    
		    
		    
	   return address;
	   }
	   else {
		
		   return  null;
		   
	   }
	}
}

	
	
	
	

