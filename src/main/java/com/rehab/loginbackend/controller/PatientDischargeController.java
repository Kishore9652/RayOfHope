package com.rehab.loginbackend.controller;

import com.rehab.loginbackend.model.PatientDischarge;
import com.rehab.loginbackend.repository.PatientDischargeRepository;
import com.rehab.loginbackend.service.PatientDischargeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/discharge")
@CrossOrigin(origins = "*")  
public class PatientDischargeController {

    @Autowired
    private PatientDischargeService dischargeService;
    
    @Autowired
    private PatientDischargeRepository dischargeRepository;

    @PostMapping
    public ResponseEntity<String> admitPatient(@RequestBody PatientDischarge discharge) {
        dischargeService.saveDischarge(discharge);
        return ResponseEntity.ok("Patient discharge saved successfully");
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<PatientDischarge> getDischarge(@PathVariable Long id) {
        return dischargeService.getDischargeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @GetMapping
    public List<PatientDischarge> getAllDischarges() {
        return dischargeRepository.findAll();
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDischarge(@PathVariable Long id) {
        if (!dischargeRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        dischargeRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    


}
