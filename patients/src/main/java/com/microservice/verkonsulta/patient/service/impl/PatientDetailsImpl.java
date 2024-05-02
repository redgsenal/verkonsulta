package com.microservice.verkonsulta.patient.service.impl;

import org.springframework.stereotype.Service;

import com.microservice.verkonsulta.patient.model.PatientDetails;
import com.microservice.verkonsulta.patient.service.PatientDetailsService;

@Service
public class PatientDetailsImpl implements PatientDetailsService {

    @Override
    public PatientDetails getPatientDetails(String partientId) {
        return new PatientDetails(partientId, partientId, partientId, partientId, partientId, partientId, partientId);
    }
    
}
