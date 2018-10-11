package com.example.Minidemo;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="candidate")
public class Candidate {
@Id
	  private String candidateId;
	    private String candidateName;
	    private String address;
	    private LocalDate dob;
	    private String emailId;
	    private String contactNumber;
	    private String maritalStatus;
	    private String gender;
	    private String passportNumber;
		private String qualificationId;
		private String qualificationName;
		private String specializationArea;
		private String collegeName;
		private String universityName;
		private String yearOfpassing;
		private double percentage;
		 private String workId;
		 
		    private String whichEmployer;
		    private String contactPerson;
		    private String positionHeld;
		    private String companyName;
		    private LocalDate employmentFrom;
		    private LocalDate employmentTo;
		    private String reasonForLeaving;
		    private String responsibilities;
		    private String hrRepName;
		    private String hrRepContactNum;
			public String getCandidateId() {
				return candidateId;
			}
			public void setCandidateId(String candidateId) {
				this.candidateId = candidateId;
			}
			public String getCandidateName() {
				return candidateName;
			}
			public void setCandidateName(String candidateName) {
				this.candidateName = candidateName;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public LocalDate getDob() {
				return dob;
			}
			public void setDob(LocalDate dob) {
				this.dob = dob;
			}
			public String getEmailId() {
				return emailId;
			}
			public void setEmailId(String emailId) {
				this.emailId = emailId;
			}
			public String getContactNumber() {
				return contactNumber;
			}
			public void setContactNumber(String contactNumber) {
				this.contactNumber = contactNumber;
			}
			public String getMaritalStatus() {
				return maritalStatus;
			}
			public void setMaritalStatus(String maritalStatus) {
				this.maritalStatus = maritalStatus;
			}
			public String getGender() {
				return gender;
			}
			public void setGender(String gender) {
				this.gender = gender;
			}
			public String getPassportNumber() {
				return passportNumber;
			}
			public void setPassportNumber(String passportNumber) {
				this.passportNumber = passportNumber;
			}
			public String getQualificationId() {
				return qualificationId;
			}
			public void setQualificationId(String qualificationId) {
				this.qualificationId = qualificationId;
			}
			public String getQualificationName() {
				return qualificationName;
			}
			public void setQualificationName(String qualificationName) {
				this.qualificationName = qualificationName;
			}
			public String getSpecializationArea() {
				return specializationArea;
			}
			public void setSpecializationArea(String specializationArea) {
				this.specializationArea = specializationArea;
			}
			public String getCollegeName() {
				return collegeName;
			}
			public void setCollegeName(String collegeName) {
				this.collegeName = collegeName;
			}
			public String getUniversityName() {
				return universityName;
			}
			public void setUniversityName(String universityName) {
				this.universityName = universityName;
			}
			public String getYearOfpassing() {
				return yearOfpassing;
			}
			public void setYearOfpassing(String yearOfpassing) {
				this.yearOfpassing = yearOfpassing;
			}
			public double getPercentage() {
				return percentage;
			}
			public void setPercentage(double percentage) {
				this.percentage = percentage;
			}
			public String getWorkId() {
				return workId;
			}
			public void setWorkId(String workId) {
				this.workId = workId;
			}
			public String getWhichEmployer() {
				return whichEmployer;
			}
			public void setWhichEmployer(String whichEmployer) {
				this.whichEmployer = whichEmployer;
			}
			public String getContactPerson() {
				return contactPerson;
			}
			public void setContactPerson(String contactPerson) {
				this.contactPerson = contactPerson;
			}
			public String getPositionHeld() {
				return positionHeld;
			}
			public void setPositionHeld(String positionHeld) {
				this.positionHeld = positionHeld;
			}
			public String getCompanyName() {
				return companyName;
			}
			public void setCompanyName(String companyName) {
				this.companyName = companyName;
			}
			public LocalDate getEmploymentFrom() {
				return employmentFrom;
			}
			public void setEmploymentFrom(LocalDate employmentFrom) {
				this.employmentFrom = employmentFrom;
			}
			public LocalDate getEmploymentTo() {
				return employmentTo;
			}
			public void setEmploymentTo(LocalDate employmentTo) {
				this.employmentTo = employmentTo;
			}
			public String getReasonForLeaving() {
				return reasonForLeaving;
			}
			public void setReasonForLeaving(String reasonForLeaving) {
				this.reasonForLeaving = reasonForLeaving;
			}
			public String getResponsibilities() {
				return responsibilities;
			}
			public void setResponsibilities(String responsibilities) {
				this.responsibilities = responsibilities;
			}
			public String getHrRepName() {
				return hrRepName;
			}
			public void setHrRepName(String hrRepName) {
				this.hrRepName = hrRepName;
			}
			public String getHrRepContactNum() {
				return hrRepContactNum;
			}
			public void setHrRepContactNum(String hrRepContactNum) {
				this.hrRepContactNum = hrRepContactNum;
			}
			@Override
			public String toString() {
				return "Candidate [candidateId=" + candidateId
						+ ", candidateName=" + candidateName + ", address="
						+ address + ", dob=" + dob + ", emailId=" + emailId
						+ ", contactNumber=" + contactNumber
						+ ", maritalStatus=" + maritalStatus + ", gender="
						+ gender + ", passportNumber=" + passportNumber
						+ ", qualificationId=" + qualificationId
						+ ", qualificationName=" + qualificationName
						+ ", specializationArea=" + specializationArea
						+ ", collegeName=" + collegeName + ", universityName="
						+ universityName + ", yearOfpassing=" + yearOfpassing
						+ ", percentage=" + percentage + ", workId=" + workId
						+ ", whichEmployer=" + whichEmployer
						+ ", contactPerson=" + contactPerson
						+ ", positionHeld=" + positionHeld + ", companyName="
						+ companyName + ", employmentFrom=" + employmentFrom
						+ ", employmentTo=" + employmentTo
						+ ", reasonForLeaving=" + reasonForLeaving
						+ ", responsibilities=" + responsibilities
						+ ", hrRepName=" + hrRepName + ", hrRepContactNum="
						+ hrRepContactNum + "]";
			}
			public Candidate(String candidateId, String candidateName,
					String address, LocalDate dob, String emailId,
					String contactNumber, String maritalStatus, String gender,
					String passportNumber, String qualificationId,
					String qualificationName, String specializationArea,
					String collegeName, String universityName,
					String yearOfpassing, double percentage, String workId,
					String whichEmployer, String contactPerson,
					String positionHeld, String companyName,
					LocalDate employmentFrom, LocalDate employmentTo,
					String reasonForLeaving, String responsibilities,
					String hrRepName, String hrRepContactNum) {
				super();
				this.candidateId = candidateId;
				this.candidateName = candidateName;
				this.address = address;
				this.dob = dob;
				this.emailId = emailId;
				this.contactNumber = contactNumber;
				this.maritalStatus = maritalStatus;
				this.gender = gender;
				this.passportNumber = passportNumber;
				this.qualificationId = qualificationId;
				this.qualificationName = qualificationName;
				this.specializationArea = specializationArea;
				this.collegeName = collegeName;
				this.universityName = universityName;
				this.yearOfpassing = yearOfpassing;
				this.percentage = percentage;
				this.workId = workId;
				this.whichEmployer = whichEmployer;
				this.contactPerson = contactPerson;
				this.positionHeld = positionHeld;
				this.companyName = companyName;
				this.employmentFrom = employmentFrom;
				this.employmentTo = employmentTo;
				this.reasonForLeaving = reasonForLeaving;
				this.responsibilities = responsibilities;
				this.hrRepName = hrRepName;
				this.hrRepContactNum = hrRepContactNum;
			}
			public Candidate() {
				super();
				// TODO Auto-generated constructor stub
			}
  
}








