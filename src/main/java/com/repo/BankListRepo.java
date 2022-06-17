package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.BankListDetails;

@Repository
public interface BankListRepo extends JpaRepository<BankListDetails, String> {

	
}
