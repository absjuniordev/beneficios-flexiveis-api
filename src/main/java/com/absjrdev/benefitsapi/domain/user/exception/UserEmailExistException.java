package com.absjrdev.benefitsapi.domain.user.exception;

public class UserEmailExistException extends UserException {
    public UserEmailExistException(String message) {
        super("E-mail já cadastrado: " +  message);
    }
}
