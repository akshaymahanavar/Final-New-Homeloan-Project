package com.wearefighters.homeloan.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data     //lombok >>setter/getter/tostring/equal/hashcode
@Entity   //database >>to create a table and heading name in class field also
public class EnquiryForm
{
  	@Id    //for primary key (no duplicate key)
  	@GeneratedValue(strategy = GenerationType.AUTO) //automatically generated id number
    private Integer formno;	
  	
   private String fullname;
   private Long pancard;
   private String email;
   private Integer age;
   private Character gender;
@OneToOne(cascade = CascadeType.ALL)
   private Cibil cibil;
     
}
