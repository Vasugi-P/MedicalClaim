package com.insurance.hcis.dto;


import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClaimRequestDto {

	@NotNull
	private Integer policyId;
	@NotNull
	private String diagnosis;
	@NotNull
	private String ailment;
	@NotNull
	private String hospitalName;
	@NotNull
	private LocalDate admissionDate;
	@NotNull
	private LocalDate dischargeDate;
	@NotNull
	private LocalDate claimDate;
	@NotNull
	private String status;
	private String approver1Comment;
	private String approver2Comment;
	@NotNull
	private Double requestedClaimAmount;

}
