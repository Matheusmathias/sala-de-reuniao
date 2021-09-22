package com.digital.crud.saladereuniao.saladereuniao.exception;

import  java.util.Date;

public class ErrorDetails {

    private Date timesTamp;
    private String message;
    private String details;

    public Date getTimesTamp() {
        return timesTamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public ErrorDetails(Date timesTamp, String message, String details) {
        super();
        this.timesTamp = timesTamp;
        this.message = message;
        this.details = details;
    }
}
