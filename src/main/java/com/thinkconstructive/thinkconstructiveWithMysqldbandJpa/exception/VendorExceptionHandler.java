package com.thinkconstructive.thinkconstructiveWithMysqldbandJpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class VendorExceptionHandler {
@ExceptionHandler(value = {VendorNotFoundException.class})
    public ResponseEntity<Object> VendorNotFoundExceptionHandler(VendorNotFoundException vendorNotFoundException){
        VendorExceptionBuilder vendorExceptionBuilder=new VendorExceptionBuilder(
                vendorNotFoundException.getMessage(),
                vendorNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(vendorExceptionBuilder,HttpStatus.NOT_FOUND);
    }
}
