package com.absjrdev.benefitsapi.domain.user.exception;

public class UserNotFoundException extends  UserException{
    public UserNotFoundException(String name) {
        super("Usuario não encontrado para o nome: " + name);
    }
    public UserNotFoundException(Long id) {
        super("Usuario não encontrado para o ID: " + id);
    }
}
