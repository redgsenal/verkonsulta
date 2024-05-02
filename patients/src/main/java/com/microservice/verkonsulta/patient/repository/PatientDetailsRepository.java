package com.microservice.verkonsulta.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.verkonsulta.patient.model.PatientDetails;

public interface PatientDetailsRepository extends JpaRepository<PatientDetails, String>{
}
