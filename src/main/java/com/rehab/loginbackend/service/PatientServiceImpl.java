package com.rehab.loginbackend.service;

import java.util.List;
import java.util.Optional;

import com.rehab.loginbackend.model.Patient;
import com.rehab.loginbackend.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
    private PatientRepository patientRepository;
	
	@Override
	public Patient savePatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Long id) {
        Optional<Patient> patient = patientRepository.findById(id);
        return patient.orElse(null);
    }

    

    @Override
    public void deletePatient(Long id) {
        if (patientRepository.existsById(id)) {
            patientRepository.deleteById(id);
        } else {
            throw new RuntimeException("Patient with ID " + id + " not found.");
        }
    }
    
    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        if (patientRepository.existsById(patient.getId())) {
            return patientRepository.save(patient);
        } else {
            throw new RuntimeException("Patient not found with ID: " + patient.getId());
        }
    }
	

}
