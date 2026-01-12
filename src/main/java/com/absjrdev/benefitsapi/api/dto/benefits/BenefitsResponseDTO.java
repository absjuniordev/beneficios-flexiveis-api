package com.absjrdev.benefitsapi.api.dto.benefits;

import com.absjrdev.benefitsapi.domain.benefits.Benefits;

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
