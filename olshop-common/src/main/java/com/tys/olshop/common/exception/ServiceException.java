package com.tys.olshop.common.exception;

public class ServiceException extends RuntimeException {
    private int errorCode;
    private String errorMessage;

    public ServiceException(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public ServiceException(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
