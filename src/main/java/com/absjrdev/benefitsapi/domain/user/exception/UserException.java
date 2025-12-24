package com.absjrdev.benefitsapi.domain.user.exception;

import com.absjrdev.benefitsapi.domain.exception.DomainException;

public class UserException extends DomainException {

    public UserException(String msg) {
        super(msg);
    }
}
