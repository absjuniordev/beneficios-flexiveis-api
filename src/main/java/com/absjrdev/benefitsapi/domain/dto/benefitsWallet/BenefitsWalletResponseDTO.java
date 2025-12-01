package com.absjrdev.benefitsapi.domain.dto.benefitsWallet;

import com.absjrdev.benefitsapi.domain.dto.benefits.BenefitsResponseDTO;
import com.absjrdev.benefitsapi.domain.dto.employee.EmployeeResponseDTO;

import java.time.LocalDate;

public record BenefitsWalletResponseDTO(EmployeeResponseDTO employee, BenefitsResponseDTO benefits, Double balance, LocalDate lastUpdate) {
}
