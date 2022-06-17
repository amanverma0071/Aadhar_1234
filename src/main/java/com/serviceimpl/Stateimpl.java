package com.serviceimpl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.ietf.jgss.GSSException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entities.State;
import com.google.gson.Gson;
import com.repo.StateRepo;
import com.service.StateService;

@Service
public class Stateimpl implements StateService {
	
	@Autowired
	private StateRepo stateRepo;

	@Value("${aeps.state.details.url1}")
	private String uri;
	
	@Override
	public void saveAndUpdate() throws Exception {

		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<Object[]> responseEntity = restTemplate.getForEntity(uri, Object[].class);
		Object[] o = responseEntity.getBody();
		for (Object os : o) {
			String s = new Gson().toJson(os);
			State st = new Gson().fromJson(s, State.class);
			stateRepo.save(st);
		}
		}
	}


