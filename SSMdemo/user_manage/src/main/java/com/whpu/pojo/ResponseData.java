package com.whpu.pojo;

public class ResponseData {

    public ResponseData() {
    }

    public ResponseData(int code, String message, boolean flag, Object result) {
        this.code = code;
        this.message = message;
        this.flag = flag;
        this.result = result;
    }

    public static ResponseData responseOk(Object result){
        return new ResponseData(200,"",true,result);
    }
    public static ResponseData responseError(String message){
        return new ResponseData(401,"",false,null);
    }

    //状态码
    private int code;
    //操作信息
    private String message;
    //操作状态
    private boolean flag;
    //数据
    private Object result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
