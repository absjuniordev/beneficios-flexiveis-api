package com.absjrdev.benefitsapi.user.domain.exception;

import com.absjrdev.benefitsapi.common.exception.DomainException;

public class UserException extends DomainException {

    public UserException(String msg) {
        super(msg);
    }
}
