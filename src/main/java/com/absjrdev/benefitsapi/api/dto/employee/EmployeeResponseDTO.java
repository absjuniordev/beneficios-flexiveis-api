package com.absjrdev.benefitsapi.api.dto.employee;

import com.absjrdev.benefitsapi.api.dto.enterprise.EnterpriseResponseDTO;

public record EmployeeResponseDTO(Long id, String name, String cpf, EnterpriseResponseDTO enterprise) {
}
