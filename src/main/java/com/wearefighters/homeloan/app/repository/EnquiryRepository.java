package com.wearefighters.homeloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wearefighters.homeloan.app.model.EnquiryForm;

@Repository
public interface EnquiryRepository extends JpaRepository<EnquiryForm, Integer>
{

	
	
	
	

}
