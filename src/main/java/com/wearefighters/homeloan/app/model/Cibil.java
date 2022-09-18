package com.wearefighters.homeloan.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
public class Cibil 
{
   @Id 
   @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cibilid;
    private Integer cibilscore;
    private String cibilstatus;
    
    
 
}




