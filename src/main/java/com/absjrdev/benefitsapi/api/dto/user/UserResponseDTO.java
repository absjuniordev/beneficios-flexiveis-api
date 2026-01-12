package com.absjrdev.benefitsapi.api.dto.user;

import com.absjrdev.benefitsapi.domain.user.User;
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
