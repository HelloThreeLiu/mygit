package com.itlsr.d9_exception_custom;

/**
    自定义的编译时异常
      1、继承Exception
      2、重写构造器
 */
public class ItlsrAgeIlleagalException extends Exception{
    public ItlsrAgeIlleagalException() {
    }

    public ItlsrAgeIlleagalException(String message) {
        super(message);
    }
}
