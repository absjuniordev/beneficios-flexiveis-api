package com.absjrdev.benefitsapi.user.domain.exception;

public class UserNotFoundException extends  UserException{
    public UserNotFoundException(String name) {
        super("Usuario não encontrado para o nome: " + name);
    }
    public UserNotFoundException(Long id) {
        super("Usuario não encontrado para o ID: " + id);
    }
}
