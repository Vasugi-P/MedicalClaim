package com.scrotify.medicalclaim.service;

import java.util.Optional;

import com.scrotify.medicalclaim.dto.ClaimRequestResponseDto;

public interface ClaimService {
	
	Optional<ClaimRequestResponseDto> validateUser(Long claimId);

}
