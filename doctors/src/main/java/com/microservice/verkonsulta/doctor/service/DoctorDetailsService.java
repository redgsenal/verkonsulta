package com.microservice.verkonsulta.doctor.service;

import com.microservice.verkonsulta.doctor.model.DoctorDetails;

public interface DoctorDetailsService {
    public DoctorDetails getDoctorDetails(String doctorId);
}