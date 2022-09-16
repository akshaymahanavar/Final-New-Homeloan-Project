package com.wearefighters.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data   //lombok >>setter/getter/tostring/equal/hashcode
@Entity //database >>to create a table and heading name in class field also
public class EnquiryForm
{
  	@Id    //for primary key (no duplicate key)
  	@GeneratedValue(strategy = GenerationType.AUTO) //automatically generated id number
    private Integer formno;	
  	
  	
//  @NotNull(message="fullname is required")
//  @Size(min=8,max=30)
  private String fullname;
  
//  @NotNull(message="Atleast 10digit required")
//  @Max(10)
   private Long mobileno;
    
//  @NotNull(message="your wrong email id fill")
  private String email;
  
  
//  @NotNull(message="age is reuired")
//  @Size(min=1,max=3)
   private Integer age;
  
  
//  @NotNull(message="gender is reuired")
//   @Max(1)
   private Character gender;

     
    
}
