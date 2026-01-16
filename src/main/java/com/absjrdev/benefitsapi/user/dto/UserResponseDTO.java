package com.absjrdev.benefitsapi.user.dto;

import com.absjrdev.benefitsapi.user.domain.User;

public record UserResponseDTO(
        Long id,
        String name,
        String email,
        String role
) {
    public static UserResponseDTO from(User user) {
        return new UserResponseDTO(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getRole()
        );
    }
}
