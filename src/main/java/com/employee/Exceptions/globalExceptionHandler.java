package com.employee.Exceptions;

import com.employee.Payloads.apiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class globalExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<?> ApiExceptionHandler(ApiException exception){
        String message = exception.getMessage();
        return new ResponseEntity<>(new apiResponse(message, false), HttpStatus.BAD_REQUEST);
    }
}
