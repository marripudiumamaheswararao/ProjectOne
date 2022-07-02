package com.vmca.pone.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vmca.pone.dto.Response;
import com.vmca.pone.dto.User;

@Service
public class ProjectOneService {
	
	@Autowired
	RestTemplate restTemplate;
	
	

	public List<User> getAllUsers() {
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<User[]> entity = restTemplate.getForEntity("http://reqres.in/api/users?page=2", User[].class);
//		User[] users = entity.getBody();
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("user-agent", "Application");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<>(headers);
		Response response=restTemplate.exchange("https://reqres.in/api/users?page=2", HttpMethod.GET, entity, Response.class ).getBody();
		
		return response.getData();
	}

	
}
