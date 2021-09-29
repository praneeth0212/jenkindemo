package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Voter;
import com.app.service.VoterCRUDService;

@RestController
@CrossOrigin
public class VoterCRUDController {



	@Autowired
	private VoterCRUDService service;
	
	@PostMapping("/voter")
	public Voter addPlayer(@RequestBody Voter voter) {
		return service.addVoter(voter);
	}

	@PutMapping("/voter")
	public Voter updatePlayer(@RequestBody Voter voter) {
		// TODO Auto-generated method stub
		return service.updateVoter(voter);
	}

//	@GetMapping("/voter/{id}")
//	public Voter getPlayerById(@PathVariable int id) {
//		// TODO Auto-generated method stub
//		return service.getVoterById(id);
//	}

	@DeleteMapping("/voter/{id}")
	public void deletePlayer(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteVoter(id);
	}


	

}
