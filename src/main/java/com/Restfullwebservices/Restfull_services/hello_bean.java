package com.Restfullwebservices.Restfull_services;

public class hello_bean {
    private String message;

    public hello_bean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "hello_bean{" +
                "message='" + message + '\'' +
                '}';
    }
}
