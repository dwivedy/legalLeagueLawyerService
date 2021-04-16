package com.dwivedy.legal.league.lawyer.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwivedy.legal.league.lawyer.service.lawyerservice.LawyerService;
import com.dwivedy.legal.league.model.mongoentity.json.LawyerJson;

@RestController
@RequestMapping(value = "/api/services")
public class LawyerController {
	
	@Autowired
	LawyerService lawyerService;
	
	
	@PostMapping(path = "/lawyer")
	public ResponseEntity<LawyerJson> save(@RequestBody LawyerJson lawyer) {
		
		LawyerJson lawyerJson= this.lawyerService.save(lawyer);
		
		if(lawyerJson.getId()!=null) {
			return new ResponseEntity<>(lawyerJson, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(lawyerJson, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping(path = "/working")
	public String working() {
		
		return "Working";
		
	}

}
