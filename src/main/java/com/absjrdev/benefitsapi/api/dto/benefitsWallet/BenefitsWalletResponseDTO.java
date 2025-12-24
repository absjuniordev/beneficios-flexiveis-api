package com.absjrdev.benefitsapi.api.dto.benefitsWallet;

import com.absjrdev.benefitsapi.api.dto.benefits.BenefitsResponseDTO;
import com.absjrdev.benefitsapi.api.dto.employee.EmployeeResponseDTO;

import java.time.LocalDate;

public record BenefitsWalletResponseDTO(EmployeeResponseDTO employee, BenefitsResponseDTO benefits, Double balance, LocalDate lastUpdate) {
}
