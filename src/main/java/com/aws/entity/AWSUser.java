package com.aws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="user")
@NoArgsConstructor
@AllArgsConstructor
public class AWSUser {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private Integer Id;
	private String username;
	private String password;
	

}
