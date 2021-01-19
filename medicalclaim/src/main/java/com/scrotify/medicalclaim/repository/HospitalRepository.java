package com.scrotify.medicalclaim.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scrotify.medicalclaim.entity.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long>{

}
