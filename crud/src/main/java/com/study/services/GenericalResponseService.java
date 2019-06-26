package com.study.services;

public class GenericalResponseService {


    public GenericalResponseService(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    private String message;
}
