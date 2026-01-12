package com.absjrdev.benefitsapi.domain.user.exception;

public class ExistEmailException extends UserException {
    public ExistEmailException(String message) {
        super("E-mail já cadastrado: " +  message);
    }
}
