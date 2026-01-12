package com.absjrdev.benefitsapi.domain.benefits.excepiton;

public class BenefitsNotExistException extends BenefitsException {

    public BenefitsNotExistException(Long id) {
        super("Benefit não encontrado para o ID: " + id);
    }

    public BenefitsNotExistException(String name) {
        super("Benefit não encontrado para o nome: " + name);
    }
}
