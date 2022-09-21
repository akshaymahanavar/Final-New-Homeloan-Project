package com.wearefighters.homeloan.app.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.exception.DataNotsavedException;
import com.wearefighters.homeloan.app.model.Address;
import com.wearefighters.homeloan.app.model.BankDetail;
import com.wearefighters.homeloan.app.model.CustomerDetails;
import com.wearefighters.homeloan.app.repository.BankRepository;
import com.wearefighters.homeloan.app.repository.CustomerRepository;
import com.wearefighters.homeloan.app.servicei.BankServiceI;

@Service
public class BankServiceImpl implements BankServiceI 
{     
       @Autowired BankRepository bankrepository;
       @Autowired CustomerRepository customerrepository;

	@Override
	public BankDetail sendbankdetail(BankDetail bank, Integer customerid) {
		
		BankDetail bankdetail = new BankDetail();
		
		   Optional<CustomerDetails> customer=customerrepository.findById(customerid);
			             
		   if(customer.isPresent())
		   {
			 
			  CustomerDetails custo= customer.get(); 
			   
			     
			  bankdetail.setBankname(bank.getBankname());
			  bankdetail.setAccountno(bank.getAccountno());
			  bankdetail.setIfsccode(bank.getIfsccode());
			  bankdetail.setBranchcode(bank.getBranchcode());
			  
			    custo.setBank(bankdetail);
			    
			    bankrepository.save(bankdetail);
			    customerrepository.save(custo);
			    
			    
			    
		   return bankdetail;
		   }
		    else
		   {
			 throw new DataNotsavedException("Address not saved in database check your input details");
		   }
		   
		}
	
}


