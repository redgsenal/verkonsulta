package com.microservice.verkonsulta.appointments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.verkonsulta.appointments.model.Appointment;
import com.microservice.verkonsulta.appointments.model.DoctorDetails;
import com.microservice.verkonsulta.appointments.model.PatientDetails;

@RestController
@RequestMapping("/appointments")
public class AppointmentsController {
    
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value="/{appointmentId}")
    public Appointment getAppointment(@PathVariable String appointmentId){

        PatientDetails patient = restTemplate.getForObject("http://localhost:9010/patient/1", PatientDetails.class);
        DoctorDetails doctor = restTemplate.getForObject("http://localhost:9020/doctor/1", DoctorDetails.class);

        Appointment appointment = new Appointment("1", "1", "1", "2024-05-05'T'10:00:00.000", "2024-05-05'T'11:20:00.000", "regular check-up");
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);
        return appointment;
    }
}
