package com.absjrdev.benefitsapi.domain.user.exception;

public class UserNotFoundException extends  UserException{
    public UserNotFoundException(String msg) {
        super("Usuario não encontrado" + msg);
    }
}
