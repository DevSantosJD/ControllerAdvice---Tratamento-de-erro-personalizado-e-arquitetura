package com.example.records.exception;

public abstract class BusinessException extends RuntimeException {

    protected BusinessException(String message){
        super(message);
    }
}
