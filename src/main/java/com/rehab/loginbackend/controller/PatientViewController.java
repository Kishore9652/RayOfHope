package com.rehab.loginbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rehab.loginbackend.model.Patient;
import com.rehab.loginbackend.service.PatientService;

@Controller
public class PatientViewController {
 
	@Autowired
    private PatientService patientService;

    @GetMapping("/patients-view")
    public String viewPatients(Model model) {
        List<Patient> patients = patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "patients"; 
    }
	
}
