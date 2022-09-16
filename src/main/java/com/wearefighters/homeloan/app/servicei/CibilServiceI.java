package com.wearefighters.homeloan.app.servicei;

import org.springframework.stereotype.Service;

import com.wearefighters.homeloan.app.model.Cibil;


public interface CibilServiceI 
{

public	Cibil postcibildata(Integer formno, Cibil cibil);

public Iterable<Cibil> getchecklistapprove();

public Iterable<Cibil> getchecklistreject();



}
