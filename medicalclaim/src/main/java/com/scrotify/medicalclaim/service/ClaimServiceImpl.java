package com.scrotify.medicalclaim.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.scrotify.medicalclaim.dto.ClaimRequestResponseDto;
import com.scrotify.medicalclaim.entity.Claim;
import com.scrotify.medicalclaim.entity.Hospital;
import com.scrotify.medicalclaim.entity.PolicyDetail;
import com.scrotify.medicalclaim.repository.ClaimRepository;
import com.scrotify.medicalclaim.repository.HospitalRepository;
import com.scrotify.medicalclaim.repository.PolicyDetailRepository;

public class ClaimServiceImpl implements ClaimService {
	
	@Autowired
	PolicyDetailRepository policyDetailRepository;
	
	@Autowired
	ClaimRepository claimRepository;
	
	@Autowired
	HospitalRepository hospitalRepository;

	@Override
	public Optional<ClaimRequestResponseDto> validateUser(Long claimId) {
		Optional<Claim> claim = claimRepository.findByClaimId(claimId);
		Optional<PolicyDetail> policyDetail = policyDetailRepository.findByPolicyId(claim.get().getClaimId());
		if(policyDetail.get().getAilments().equals(claim.get().getAliment())) {
			if(policyDetail.get().getHospitals().equals(claim.get().getHospitalDetails())) {
				if(policyDetail.get().getPolicyId().equals(claim.get().getPolicyDetail())) {
					ClaimRequestResponseDto claimRequestResponseDto= new ClaimRequestResponseDto();
					claimRequestResponseDto.setMessage("Your request is done");
					claimRequestResponseDto.setStatusCode(200);
				}
			}
		}
		
		return null;
	}

}
