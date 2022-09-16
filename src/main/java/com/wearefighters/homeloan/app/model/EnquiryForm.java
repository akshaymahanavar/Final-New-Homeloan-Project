package com.wearefighters.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data   //lombok >>setter/getter/tostring/equal/hashcode
@Entity //database >>to create a table and heading name in class field also
public class EnquiryForm
{
  	 @Id    //for primary key (no duplicate key)
  	@GeneratedValue(strategy = GenerationType.AUTO) //automatically generated id number
    private Integer formno;	
  	
  	
 // @NotNull(message="fullname is required")
    private String fullname;
  
 // @NotNull(message="fullname is required")
    private Long mobileno;
  
 // @NotNull(message="fullname is required")
    private String email;
  
 //@NotNull(message="fullname is required")
    private Integer age;
  
 // @NotNull(message="fullname is required")
    private Character gender;
   
  
     
    
}
