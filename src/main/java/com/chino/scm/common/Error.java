package com.chino.scm.common;

public class Error extends RuntimeException{
    private String msg;
    public Error(String message) {
        super(message);
    }
}
