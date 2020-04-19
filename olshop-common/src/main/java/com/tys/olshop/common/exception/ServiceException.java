package com.tys.olshop.common.exception;

/**
 * @author TYS
 * @date 2020/4/18 13:53
 */
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
