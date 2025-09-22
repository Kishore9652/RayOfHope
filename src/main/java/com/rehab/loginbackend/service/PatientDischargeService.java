package com.rehab.loginbackend.service;

import java.util.List;
import java.util.Optional;

import com.rehab.loginbackend.model.PatientDischarge;

public interface PatientDischargeService {

	void saveDischarge(PatientDischarge discharge);

    Optional<PatientDischarge> getDischargeById(Long id);

    List<PatientDischarge> getAllDischarges();

    void deleteDischargeById(Long id);
	
}
