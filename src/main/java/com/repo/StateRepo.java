package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.State;

@Repository
public interface StateRepo extends JpaRepository<State, Integer> {

	
}
