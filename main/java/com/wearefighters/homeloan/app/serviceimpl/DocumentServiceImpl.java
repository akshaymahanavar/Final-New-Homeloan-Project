package com.wearefighters.homeloan.app.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.model.CustomerDetails;
import com.wearefighters.homeloan.app.model.Document;
import com.wearefighters.homeloan.app.repository.CustomerRepository;
import com.wearefighters.homeloan.app.repository.DocumentRepository;
import com.wearefighters.homeloan.app.servicei.DocumentServiceI;


@Service
public class DocumentServiceImpl implements DocumentServiceI 
{
	
	@Autowired private DocumentRepository documentrepository;
    @Autowired private  CustomerRepository customerrepository;
	
	
	
	@Override
	public Document senddocument(Document document, Integer customerid) 
	{
		    
		        Document doc=new Document();
		
		
		
		
	 Optional<CustomerDetails>  customer = customerrepository.findById(customerid); 
	  
	 
	            if(customer.isPresent())
	            {
		 
		          CustomerDetails details=customer.get();
		 
		              
		          doc.setPhoto(document.getPhoto());
		          doc.setSignature(document.getSignature());
		          doc.setElectricbill(document.getElectricbill());
		          doc.setAdharcard(document.getAdharcard());
		          doc.setPancard(document.getPancard());
		          doc.setPropertydocument(document.getPropertydocument());
		          doc.setBankpassbook(document.getBankpassbook());
		          
		          
		        details.setDocument(doc);//to set the document in customer(because one to one relationship use)
		          
		            
		              
		              documentrepository.save(doc); //document
		              
		              customerrepository.save(details); //customer
		          
		          
		       return  doc;
		 
	            }
	 
	 
	 
		
		
		
		return null;
	}



	@Override
	public Document getsingledoc(Integer docid)
	{
	
		return  documentrepository.getById(docid);
	}

	
	
	
}
