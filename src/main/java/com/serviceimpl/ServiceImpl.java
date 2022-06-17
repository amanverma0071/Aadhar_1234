package com.serviceimpl;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entities.AadharBank;
import com.entities.Bank;
import com.repo.AadharReop;
import com.service.BankService;


@Service
public class ServiceImpl implements BankService {
	
	@Value("${aeps.aadhar.bank.url}")
	private String aepsURL;

	@Autowired
	private AadharReop aadharrepo;

	@Override
	public void saveAndUpdate() throws Exception {
		try {
			RestTemplate restTemplate=new RestTemplate();
		    Bank result =restTemplate.getForObject(aepsURL,Bank.class);
		    aadharrepo.saveAll(result.getData());
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}	
	}

		

	
}
