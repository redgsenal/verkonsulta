package com.microservice.verkonsulta.doctor.service.impl;

import com.microservice.verkonsulta.doctor.model.DoctorDetails;
import com.microservice.verkonsulta.doctor.service.DoctorDetailsService;

public class DoctorDetailsImpl implements DoctorDetailsService{

    @Override
    public DoctorDetails getDoctorDetails(String doctorId) {
        return new DoctorDetails();
    }
    
}
