package com.rehab.loginbackend.service;

import com.rehab.loginbackend.model.Patient;
import java.util.List;
public interface PatientService {

	Patient savePatient(Patient patient);
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);
    void deletePatient(Long id);
	
    Patient addPatient(Patient patient);  

    Patient updatePatient(Patient patient); 
}
