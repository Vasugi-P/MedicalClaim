package com.scrotify.medicalclaim.repository;

import com.scrotify.medicalclaim.entity.PolicyDetail;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyDetailRepository extends JpaRepository<PolicyDetail, Long> {
	
   Optional<PolicyDetail> findByPolicyId(Long policyId);
}
