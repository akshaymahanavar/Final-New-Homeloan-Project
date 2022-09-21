package com.wearefighters.homeloan.app.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.wearefighters.homeloan.app.model.Document;
import com.wearefighters.homeloan.app.servicei.DocumentServiceI;


@CrossOrigin("*")
@RestController
public class DocumentController
{
	
   @Autowired private DocumentServiceI documentservicei;


         //sned to database

   @PostMapping(value = "/savedocumnent/{customerid}",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
   public Document savedoc(@RequestPart(required = true,value ="photo")MultipartFile pic,
		   @RequestPart(required = true,value = "signature")MultipartFile sign,
		   @RequestPart(required = true,value = "electricbill")MultipartFile ebill,
		   @RequestPart(required = true,value = "pancard")MultipartFile pan,
		   @RequestPart(required = true,value = "adharcard")MultipartFile adhar,
		   @RequestPart(required = true,value = "propertydocument")MultipartFile property,
		   @RequestPart(required = true,value = "bankpassbook")MultipartFile passbook,@PathVariable Integer customerid) throws IOException
				  
		  {
	              
	              Document document=new Document();
	               
	              document.setPhoto(pic.getBytes());
	              document.setSignature(sign.getBytes());
	              document.setElectricbill(ebill.getBytes());
	              document.setPancard(pan.getBytes());
	              document.setAdharcard(adhar.getBytes());
	              document.setPropertydocument(property.getBytes());
	              document.setBankpassbook(passbook.getBytes());
	              
	   
	   

   return documentservicei.senddocument(document,customerid);
   }
         //get document
   @GetMapping(value="/getsingleDoc/{docid}")
   public Document getsingleid(@PathVariable Integer docid)
   {
	  return  documentservicei.getsingledoc(docid);
   }


	
	
	
	
	
	
	
	

}
