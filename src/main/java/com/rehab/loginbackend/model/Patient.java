package com.rehab.loginbackend.model;



import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    
    
    private Long id;  

    private String name;
    private String dob;
    private int age;
    private String status;
    private String education;
    private String occupation;
    private String religion;

    @Column(name = "support_person")
    private String supportPerson;
    private String contact1;
    private String contact2;
    private String address;

    private String addiction;
    
    @Column(name = "addiction_period")
    private String addictionperiod;

    private String relapse;
    private String institution;
    private int year;
    private String abstinence;
    
    private String imageFileName;
    
    public String getImageFileName() {return imageFileName;}
	public void setImageFileName(String imageFileName) {this.imageFileName = imageFileName;}
	

    @ElementCollection
    private List<String> healthIssues;

    private String accommodation;

    
    
    
    public List<String> getHealthIssues() {return healthIssues;}
	public void setHealthIssues(List<String> healthIssues) {this.healthIssues = healthIssues;}
	
	public long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getEducation() { return education; }
    public void setEducation(String education) { this.education = education; }

    public String getOccupation() { return occupation; }
    public void setOccupation(String occupation) { this.occupation = occupation; }

    public String getReligion() { return religion; }
    public void setReligion(String religion) { this.religion = religion; }

    public String getSupportPerson() 
    { 
    	return supportPerson; 
    }
    public void setSupportPerson(String supportPerson) 
    { 
    	this.supportPerson = supportPerson; 
    }

    public String getContact1() { return contact1; }
    public void setContact1(String contact1) { this.contact1 = contact1; }

    public String getContact2() { return contact2; }
    public void setContact2(String contact2) { this.contact2 = contact2; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getAddiction() { return addiction; }
    public void setAddiction(String addiction) { this.addiction = addiction; }

    

    public String getInstitution() { return institution; }
    public void setInstitution(String institution) { this.institution = institution; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getAbstinence() { return abstinence; }
    public void setAbstinence(String abstinence) { this.abstinence = abstinence; }

    

    public String getAccommodation() { return accommodation; }
    public void setAccommodation(String accommodation) { this.accommodation = accommodation; }

	
	

	public String getAddictionperiod(){return addictionperiod;}
	public void setAddictionperiod(String addictionperiod) {this.addictionperiod = addictionperiod;}
	public String getRelapse() {
		return relapse;
	}
	public void setRelapse(String relapse) {
		this.relapse = relapse;
	}
}

