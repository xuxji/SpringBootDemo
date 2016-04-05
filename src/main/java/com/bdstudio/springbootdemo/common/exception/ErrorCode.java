package com.bdstudio.springbootdemo.common.exception;

/**
 * 
 * @author xuxiao
 *
 */
public class ErrorCode {
	//--公共处理错误--
    public static final ErrorCode ERROR_MESSAGE = new ErrorCode(800, "Error!");
    public static final ErrorCode LOGIN_ERROR = new ErrorCode(801, "Login Error!");
    
    //--其他处理错误--
    
    private final int value; // Error code value
    private final String describe; // Error code describe

    protected ErrorCode(int value, String desc) {
        this.value = value;
        this.describe = desc;
    }

    public int getValue() {
        return value;
    }

    public String getDescribe() {
        return describe;
    }
}
