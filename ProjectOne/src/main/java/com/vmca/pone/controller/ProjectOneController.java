package com.vmca.pone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vmca.pone.dto.User;
import com.vmca.pone.service.ProjectOneService;

@RestController
public class ProjectOneController {
	
	@Autowired
	ProjectOneService service;
	
	@GetMapping("/getUsers")
	public List<User> getAllUsers(){
		return service.getAllUsers();
	}

}
