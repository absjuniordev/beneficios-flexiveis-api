package com.absjrdev.benefitsapi.user.dto;

import com.absjrdev.benefitsapi.user.domain.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegisterRequestDTO(

        @Email
        @NotBlank
        String email,

        @NotBlank
        String password,

        @NotNull
        Role role

) {}
