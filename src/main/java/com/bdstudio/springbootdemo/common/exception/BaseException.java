package com.bdstudio.springbootdemo.common.exception;

import java.util.Collection;

public class BaseException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private ErrorCode errorCode;
    private Boolean suppressError = false;
    private Collection<?> errors;

    public BaseException(String message) {
        super(message);
    }

    public BaseException(ErrorCode errorCode) {
        super(errorCode.getDescribe());
        this.errorCode = errorCode;
    }

    public BaseException(ErrorCode errorCode, Collection<?> errors) {
        super(errorCode.getDescribe());
        this.errorCode = errorCode;
        this.errors = errors;
    }

    public BaseException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
    
    public BaseException(ErrorCode errorCode, String message, Boolean suppressError) {
        super(message);
        this.errorCode = errorCode;
        this.suppressError = suppressError;
    }

    public BaseException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getDescribe(), cause);
        this.errorCode = errorCode;
    }
    
    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(ErrorCode errorCode, String message, Throwable cause) {
        super(errorCode.getDescribe() + "\n" + message, cause);
        this.errorCode = errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
    
    public Boolean getSuppressError(){
    	return suppressError;
    }
    
    public void setSuppressError(Boolean suppressError){
    	this.suppressError = suppressError;
    }

//    public String getDescribe() {
//        return describe;
//    }
//
//    public void setDescribe(String describe) {
//        this.describe = describe;
//    }

    public Collection<?> getErrors() {
        return errors;
    }

    public void setErrors(Collection<?> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        String message = getLocalizedMessage();
        return message;
    }

}
