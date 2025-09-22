package com.rehab.loginbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PatientDischarge {
	
	@Id
    private Long id;  

    private Long patientId;
    private String patientName;
    private String accommodation;
    private String addiction;
    private String medicine;
    private String supportPerson;
    private String contact;

    private String admittedDate;
    private String dischargeDate;

    private String imageFileName;

    


    public PatientDischarge() {
    }

    public PatientDischarge(Long id, Long patientId, String patientName, String accommodation, String addiction, String medicine,
                            String supportPerson, String contact, String admittedDate, String dischargeDate,String imageFileName) {
        this.id = id;
        this.patientId = patientId;
        this.patientName = patientName;
        this.accommodation = accommodation;
        this.addiction = addiction;
        this.medicine = medicine;
        this.supportPerson = supportPerson;
        this.contact = contact;
        this.admittedDate = admittedDate;
        this.dischargeDate = dischargeDate;
        this.imageFileName = imageFileName;
    }

    // ===== Getters and Setters =====

    
    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }

    public String getAddiction() {
        return addiction;
    }

    public void setAddiction(String addiction) {
        this.addiction = addiction;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getSupportPerson() {
        return supportPerson;
    }

    public void setSupportPerson(String supportPerson) {
        this.supportPerson = supportPerson;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAdmittedDate() {
        return admittedDate;
    }

    public void setAdmittedDate(String admittedDate) {
        this.admittedDate = admittedDate;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

	
}
