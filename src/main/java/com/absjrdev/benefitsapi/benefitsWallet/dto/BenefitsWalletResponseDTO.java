package com.absjrdev.benefitsapi.benefitsWallet.dto;

import com.absjrdev.benefitsapi.benefits.dto.BenefitsResponseDTO;
import com.absjrdev.benefitsapi.employee.dto.EmployeeResponseDTO;

import java.time.LocalDate;

public record BenefitsWalletResponseDTO(EmployeeResponseDTO employee, BenefitsResponseDTO benefits, Double balance, LocalDate lastUpdate) {
}
