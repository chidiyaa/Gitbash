package com.example.Minidemo;

import java.util.ArrayList;
import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class CandidateServiceImpl implements CandidateService {
	@Autowired
	CandidateDAO cdao;
	@Autowired
	JobRequirementsDao jdao;
	@Autowired
	JobAppliedDao jao;
	
	// Search for jobs based on qualification, position, years of experience,location
	@Override
	public ArrayList<JobRequirements> findBy(String qualification,
			String position, int experience,String location) {
		
          
            return jdao.findBy(qualification,position,experience,location);
       
	}
	
	// Add Resume
	@Override
	public String addResume(Candidate candidate)  {
		
			if(cdao.existsById(candidate.getCandidateId())){
					return "resume already exists";
		}
			else{
		 cdao.save(candidate);
			}
		return "Resume added";
	}
	
	//Modify Resume
	@Override
	public String modifyResume(Candidate candidate,String candidateId) {
		// TODO Auto-generated method stub
		if(cdao.existsById(candidateId)){
			 cdao.save(candidate);
}
	else{
return "Resume does not exists";
	}
		return "Resume updated";
	}
	
	//Apply for job
	@Override
	public int applyForJob(JobApplied job)
			 {
		jao.save(job);
		return 1;
	}
	

	
	//Candidate to get job requirements of the company
	@Override
	public List<JobRequirements> getJobRequirements()
			 {
		// TODO Auto-generated method stub
		return  jdao.findAll();
	}


	

}
