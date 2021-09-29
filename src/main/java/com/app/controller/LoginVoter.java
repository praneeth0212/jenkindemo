package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Voter;
import com.app.repository.VoterRepository;
import com.app.service.VoterCRUDService;

@RestController
@CrossOrigin
public class LoginVoter {
	@Autowired
	private VoterRepository service;
	
	@PostMapping("/voter/login")
	public Voter loginValidation(@RequestBody Voter voter) throws Exception {
		Voter c = new Voter();
	boolean flag = false;
		c = service.findById(voter.getId()).get();
		if (c.getAadhaarNumber()==(voter.getAadhaarNumber())) {
			flag = true;
		}
		if (flag) {
			return c;
		} else {
			throw new Exception();
		}
	}
}



	
	

	


