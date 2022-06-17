package com.serviceimpl;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.entities.BankList;
import com.entities.BankListDetails;
import com.repo.BankListRepo;
import com.service.AepsBankListService;

@Service
public class AepsBankListImpl implements AepsBankListService {

	@Value("${aeps.bank.banklist.url2}")
	private String aepsUrl;
	@Autowired
	private BankListRepo aepsBankDetails;
	
	@Override
	public void saveAndUpdate() throws Exception {
		
		try {
		RestTemplate restTemplate=new RestTemplate();
		BankList result=restTemplate.getForObject(aepsUrl, BankList.class);
			aepsBankDetails.saveAll(result.getData());
		
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}
		
		
	}

}
