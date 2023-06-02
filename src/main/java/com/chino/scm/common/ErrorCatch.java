package com.chino.scm.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorCatch {

    @ExceptionHandler(Error.class)
    public Result<String> error(Exception e){
        System.out.println(e.getMessage());
        return new Result<>(500,e.getMessage());
    }
}
