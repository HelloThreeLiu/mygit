package com.itlsr.d9_exception_custom;

/**
    自定义的编译时异常
      1、继承RuntimeException
      2、重写构造器
 */
public class ItlsrAgeIlleagalRuntimeException extends RuntimeException{
    public ItlsrAgeIlleagalRuntimeException() {
    }

    public ItlsrAgeIlleagalRuntimeException(String message) {
        super(message);
    }
}
