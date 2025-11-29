package com.absjrdev.benefitsapi.domain.dto.employee;

import com.absjrdev.benefitsapi.domain.dto.enterprise.EnterpriseResponseDTO;

public record EmployeeResponseDTO(Long id, String name, String cpf, EnterpriseResponseDTO enterprise) {
}
