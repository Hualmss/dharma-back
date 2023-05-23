package com.dharma.infoBook.infobookservice.CustomErrors;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException{

    public ResourceNotFound(String Message){
        super(Message);
    }
    public ResourceNotFound(String Message, Throwable exception){
        super(Message, exception);
    }
}
