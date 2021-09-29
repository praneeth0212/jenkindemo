package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Voter;
import com.app.repository.VoterRepository;
import com.app.service.VoterSearchService;


@Service
public class VoterSearchServiceImpl implements VoterSearchService {
	
	
	

		@Autowired
		private VoterRepository repository;
		@Override
		public List<Voter> getAllVoters() {
			// TODO Auto-generated method stub
			return repository.findAll();
		}

		@Override
		public List<Voter> getVotersByName(String name) {
			// TODO Auto-generated method stub
			return repository.findByName(name);
		}

		@Override
		public List<Voter> getVotersByAge(int age) {
			// TODO Auto-generated method stub
			return repository.findByAge(age);
		}
		@Override
		public Voter getVotersById(int id) {
			// TODO Auto-generated method stub
			return repository.findById(id).get();
		}
		
	

}
