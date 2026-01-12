package com.absjrdev.benefitsapi.domain.benefits.excepiton;

public class BenefitsExistException extends BenefitsException {
    public BenefitsExistException(String message) {
        super("Beneficio já criado: " + message);
    }
}
