package com.rehab.loginbackend.repository;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.rehab.loginbackend.model.Patient;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.rehab.loginbackend.repository")
@EntityScan(basePackages = "com.rehab.loginbackend.model")

@Repository 
public interface PatientRepository extends JpaRepository<Patient, Long> {
}