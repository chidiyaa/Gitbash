package com.example.Minidemo;

import java.util.ArrayList;
import java.util.List;




public interface CandidateService {
		
		 String addResume(Candidate candidate)  ;
	
			List<JobRequirements> getJobRequirements() ;

			
					

			int applyForJob(JobApplied job);

			ArrayList<JobRequirements> findBy(String qualificationRequired,
					String positionRequired, int experienceRequired,
					String jobLocation);

			String modifyResume(Candidate candidate, String candidateId);

}
