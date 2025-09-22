package com.rehab.loginbackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rehab.loginbackend.model.PatientDischarge;
import com.rehab.loginbackend.repository.PatientDischargeRepository;

@Service
public class PatientDischargeServiceImpl implements PatientDischargeService {
		
	 @Autowired
	    private PatientDischargeRepository dischargeRepository;

	    @Override
	    public void saveDischarge(PatientDischarge discharge) {
	        dischargeRepository.save(discharge);
	    }

	    @Override
	    public Optional<PatientDischarge> getDischargeById(Long id) {
	        return dischargeRepository.findById(id);
	    }

	    @Override
	    public List<PatientDischarge> getAllDischarges() {
	        return dischargeRepository.findAll();
	    }

	    @Override
	    public void deleteDischargeById(Long id) {
	        dischargeRepository.deleteById(id);
	    }
		
	
}
