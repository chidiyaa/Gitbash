package com.example.Minidemo;

import org.springframework.data.mongodb.repository.MongoRepository;




public interface JobAppliedDao extends MongoRepository<JobApplied, String> {

}
