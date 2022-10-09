package com.aws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aws.entity.AWSUser;
import com.aws.service.IAWSService;

@RestController
@RequestMapping("/v1/aws")
public class AWSController {
	@Autowired
	private IAWSService awsService;

	@PostMapping("/add-user")
	public AWSUser addAWSUser(@RequestBody AWSUser user) {
		return awsService.addUser(user);
	}
	
	
}
