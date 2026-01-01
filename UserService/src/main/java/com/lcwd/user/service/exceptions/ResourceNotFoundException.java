package com.lcwd.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    //extra
    public ResourceNotFoundException(){
        super("Resource not found on server !!");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }
}
