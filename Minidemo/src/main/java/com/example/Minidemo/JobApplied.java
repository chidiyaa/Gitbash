package com.example.Minidemo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="JobApplied")
public class JobApplied {
	private String jobId;
	@Id
	private String candidateId;
	public JobApplied() {
		super();
	}
	public JobApplied(String jobId, String candidateId) {
		super();
		this.jobId = jobId;
		this.candidateId = candidateId;
	}
	@Override
	public String toString() {
		return "JobApplied [jobId=" + jobId + ", candidateId=" + candidateId
				+ "]";
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

}
