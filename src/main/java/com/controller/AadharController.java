package com.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.BankService;

@RestController
public class AadharController {
	
	@Autowired
	private BankService aepsAadhar;

	@GetMapping(value="/bank")
	public String syncAndUpdateAllBank(
			HttpServletRequest request) {
	     
		try {
			aepsAadhar.saveAndUpdate();
			return "Bank Saved";
		} catch (Exception e) {
			return e.getMessage();
		}
	   }
	

	}
