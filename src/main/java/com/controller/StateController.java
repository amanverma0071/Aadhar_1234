package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.StateService;



@RestController
public class StateController {
	
	@Autowired
	private StateService stateService;
	
	@GetMapping(value="/allservice")
	public String saveAndUpdate() {
		try {
			stateService.saveAndUpdate();
			return "SAVED";
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}

}
