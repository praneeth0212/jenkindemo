package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Contestant;

@Repository
public interface ContestantRepository extends JpaRepository <Contestant , Integer> {
	List<Contestant> findByName(String name);
	List<Contestant> findByAge(int age);
	List<Contestant> findByPartyName(String partyName);
}
