package com.Restfullwebservices.Restfull_services.exception;

import java.util.Date;

public class Exception {
    private Date timestamp;
    private String message;
    private String details;

    public Exception(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
