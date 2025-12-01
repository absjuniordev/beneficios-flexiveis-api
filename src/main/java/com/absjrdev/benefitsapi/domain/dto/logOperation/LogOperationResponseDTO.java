package com.absjrdev.benefitsapi.domain.dto.logOperation;

import com.absjrdev.benefitsapi.domain.dto.user.UserResponseDTO;


import java.time.LocalDateTime;

public record LogOperationResponseDTO(Long id, String action, LocalDateTime dateTime, String detail,
                                      UserResponseDTO user) {
}
