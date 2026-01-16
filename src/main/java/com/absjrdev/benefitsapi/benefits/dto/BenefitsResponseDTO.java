package com.absjrdev.benefitsapi.benefits.dto;

import com.absjrdev.benefitsapi.benefits.domain.Benefits;

public record BenefitsResponseDTO(
        Long id,
        String name,
        String description,
        Double limitMonthly
) {
    public static BenefitsResponseDTO from(Benefits benefits) {
        return new BenefitsResponseDTO(
                benefits.getId(),
                benefits.getNome(),
                benefits.getDescription(),
                benefits.getLimitMonthly());
    }
}
