package com.microservice.verkonsulta.doctor.controller;

import com.microservice.verkonsulta.doctor.model.DoctorDetails;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @GetMapping(value="/{doctorId}")
    public DoctorDetails getDoctor(@PathVariable String doctorId) {
        return new DoctorDetails("1", "Dan", "Larks", "1975-11-11", "Singapore", "Unit ZYX 222", "male");
    }
}
