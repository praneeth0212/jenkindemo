package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Voter;
import com.app.service.VoterSearchService;




@RestController
@CrossOrigin
public class VoterSearchController {
	

		@Autowired
		private VoterSearchService service;
		
		@GetMapping("/voters")
		public List<Voter> getAllVoters() {
			// TODO Auto-generated method stub
			return service.getAllVoters();
		}

		@GetMapping("/voters/name/{name}")
		public List<Voter> getVotersByName(@PathVariable String name) {
			// TODO Auto-generated method stub
			return service.getVotersByName(name);
		}

		@GetMapping("/voters/age/{age}")
		public List<Voter> getVotersByAge(@PathVariable int age) {
			// TODO Auto-generated method stub
			return service.getVotersByAge(age);
		}
//		@GetMapping("/voters/id/{id}")
//		public List<Voter> getVotersById(@PathVariable int id) {
//			// TODO Auto-generated method stub
//			return service.getVotersById(id);
//		}
//		
		

}
