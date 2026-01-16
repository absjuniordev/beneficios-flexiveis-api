package com.absjrdev.benefitsapi.benefits.domain.excepiton;

import com.absjrdev.benefitsapi.common.exception.DomainException;

public class BenefitsException extends DomainException {
    public BenefitsException(String message) {
        super(message);
    }
}
