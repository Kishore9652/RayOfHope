package com.rehab.loginbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rehab.loginbackend.model.PatientDischarge;

@Repository
public interface PatientDischargeRepository extends JpaRepository<PatientDischarge, Long> {

}
