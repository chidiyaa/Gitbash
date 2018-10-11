package com.example.Minidemo;


import org.springframework.data.mongodb.repository.MongoRepository;




public interface CandidateDAO  extends MongoRepository<Candidate, String> {


}