package com.challenge.eventAPI.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(){
        super("Resource not Found");
    }
}
