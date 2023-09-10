package com.exception;

public class ZeroDevicerException extends Exception {
    public ZeroDevicerException(Exception exception) {
        super(exception);
    }

    public ZeroDevicerException(String message) {
        super(message);
    }
}
