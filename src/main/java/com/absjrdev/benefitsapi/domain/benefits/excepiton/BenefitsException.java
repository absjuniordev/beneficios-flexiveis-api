package com.absjrdev.benefitsapi.domain.benefits.excepiton;

import com.absjrdev.benefitsapi.domain.exception.DomainException;

public class BenefitsException extends DomainException {
    public BenefitsException(String message) {
        super(message);
    }
}
