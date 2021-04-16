package com.dwivedy.legal.league.model.mongoentity.json;

import java.util.List;

import com.dwivedy.legal.league.model.mongoentity.Client;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LawyerJson {

	private String id;
	
	private String lawyerName;
	
	private List<String> expertiseSkills;
	
	private Integer fee;
	
	private List<Client> clients;

}
