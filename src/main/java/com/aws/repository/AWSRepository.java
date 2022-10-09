package com.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aws.entity.AWSUser;

public interface AWSRepository extends JpaRepository<AWSUser, Integer> {

}
