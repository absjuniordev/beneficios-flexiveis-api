package com.absjrdev.benefitsapi.api.dto.user;
public record UserRequestDTO(
        String name,
        String email,
        String password,
        String role
) {}
