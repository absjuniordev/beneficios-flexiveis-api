package com.absjrdev.benefitsapi.api.dto.logOperation;

import com.absjrdev.benefitsapi.api.dto.user.UserResponseDTO;


import java.time.LocalDateTime;

public record LogOperationResponseDTO(Long id, String action, LocalDateTime dateTime, String detail,
                                      UserResponseDTO user) {
}
