package com.absjrdev.benefitsapi.employee.dto;

import com.absjrdev.benefitsapi.enterprise.dto.EnterpriseResponseDTO;

public record EmployeeResponseDTO(Long id, String name, String cpf, EnterpriseResponseDTO enterprise) {
}
