package com.dwivedy.legal.league.lawyer.service.lawyerservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.dwivedy.legal.league.lawyer.service.lawyerservice.LawyerService;
import com.dwivedy.legal.league.model.mongoentity.Lawyer;
import com.dwivedy.legal.league.model.mongoentity.json.LawyerJson;

@Service
public class LawyerServiceImpl implements LawyerService {
	
	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public LawyerJson save(LawyerJson lawyer) {
		Lawyer persistentLawyer= new Lawyer();
		persistentLawyer.setLawyerName(lawyer.getLawyerName());
		persistentLawyer.setExpertiseSkills(lawyer.getExpertiseSkills());
		Lawyer persistLawyer=this.mongoTemplate.save(persistentLawyer);
		lawyer.setId(persistLawyer.getId().toHexString());
		return lawyer;
	}

}
