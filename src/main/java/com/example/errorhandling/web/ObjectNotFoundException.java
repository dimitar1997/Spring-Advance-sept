package com.example.errorhandling.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ObjectNotFoundException extends RuntimeException{
    private final Long id;
    public ObjectNotFoundException(Long id) {
        super("Cannot find product with id" + id);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
