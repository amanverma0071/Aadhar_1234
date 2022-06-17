package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.AadharBank;

@Repository
public interface AadharReop extends JpaRepository<AadharBank, String> {

}
