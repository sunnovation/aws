package com.aws.service;

import org.springframework.stereotype.Service;

import com.aws.entity.AWSUser;
import com.aws.repository.AWSRepository;

@Service
public class AWSService implements IAWSService{
	
	
	private AWSRepository awsRepository;

	@Override
	public AWSUser addUser(AWSUser user) {
		return awsRepository.save(user);
	}

}
