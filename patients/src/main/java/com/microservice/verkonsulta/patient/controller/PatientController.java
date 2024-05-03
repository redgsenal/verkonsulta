package com.microservice.verkonsulta.patient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.verkonsulta.patient.model.PatientDetails;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/patient")
public class PatientController {

    @GetMapping(value="/{patientId}")
    public PatientDetails getPatient(@PathVariable String patientId) {
        return new PatientDetails("1", "John", "Doe", "1990-01-01", "Singapore", "Unit ABC 123", "male");
    }
}
