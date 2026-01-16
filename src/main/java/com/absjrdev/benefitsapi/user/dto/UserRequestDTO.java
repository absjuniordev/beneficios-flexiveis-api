package com.absjrdev.benefitsapi.user.dto;
public record UserRequestDTO(
        String name,
        String email,
        String password,
        String role
) {}
