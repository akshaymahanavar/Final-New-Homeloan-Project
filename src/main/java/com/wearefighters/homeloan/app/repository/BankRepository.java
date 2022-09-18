package com.wearefighters.homeloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wearefighters.homeloan.app.model.BankDetail;

public interface BankRepository extends JpaRepository<BankDetail, Integer>
{

}
