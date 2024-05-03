package com.microservice.verkonsulta.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.verkonsulta.doctor.model.DoctorDetails;

public interface DoctorDetailsRepository extends JpaRepository<DoctorDetails, String> {
}
