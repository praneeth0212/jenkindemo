package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Voter;
import com.app.repository.VoterRepository;
import com.app.service.VoterCRUDService;

@Service
public class VoterCRUDServiceImpl implements VoterCRUDService {
	
	@Autowired
	private VoterRepository repository;

	@Override
	public Voter addVoter(Voter voter) {
		// TODO Auto-generated method stub
		return repository.save(voter);
	}

	@Override
	public Voter updateVoter(Voter voter) {
		// TODO Auto-generated method stub
		return repository.save(voter);
	}

//	@Override
//	public Voter getVoterById(int id) {
//		// TODO Auto-generated method stub
//		return repository.findById(id).get();
//		//return repository.findById(id).get();
	//}

	@Override
	public void deleteVoter(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

}
