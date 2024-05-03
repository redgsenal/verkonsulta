package com.microservice.verkonsulta.appointments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.verkonsulta.appointments.model.Appointment;

@RestController
@RequestMapping("/appointments")
public class AppointmentsController {
    
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value="/{appointmentId}")
    public Appointment getAppointment(@PathVariable String appointmentId){
        return new Appointment();
    }
}
