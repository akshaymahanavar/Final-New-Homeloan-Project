package com.wearefighters.homeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CustomerStatus 
{
     @Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer statusid;
     
private String personalstatus;
private String addressstatus;
private String bankstatus;
private String documentstatus;
private String verificarion;

}
