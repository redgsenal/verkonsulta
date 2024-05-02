package com.microservice.verkonsulta.patient.service;

import com.microservice.verkonsulta.patient.model.PatientDetails;

public interface PatientDetailsService {
    public PatientDetails getPatientDetails(String partientId);
}