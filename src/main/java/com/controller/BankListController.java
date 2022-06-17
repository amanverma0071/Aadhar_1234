package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.AepsBankListService;


@RestController
public class BankListController {
	
	@Autowired
	private AepsBankListService aepsBankService;
	
	@GetMapping(value="/Details")
	public String saveAndUpdateBankDetails() {
		try {
			aepsBankService.saveAndUpdate();
			return "Details Saved";
			
		}catch(Exception e){
			return e.getMessage();
		}
	}

	
}
