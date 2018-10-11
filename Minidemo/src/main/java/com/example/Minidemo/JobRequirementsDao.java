package com.example.Minidemo;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface JobRequirementsDao extends MongoRepository<JobRequirements, String>{
	public ArrayList<JobRequirements> findBy(String qualification,
			String position, int experience,String location);
}
