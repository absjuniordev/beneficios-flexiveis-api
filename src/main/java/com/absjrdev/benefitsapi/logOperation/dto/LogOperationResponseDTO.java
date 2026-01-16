package com.absjrdev.benefitsapi.logOperation.dto;

import com.absjrdev.benefitsapi.user.dto.UserResponseDTO;


import java.time.LocalDateTime;

public record LogOperationResponseDTO(Long id, String action, LocalDateTime dateTime, String detail,
                                      UserResponseDTO user) {
}
