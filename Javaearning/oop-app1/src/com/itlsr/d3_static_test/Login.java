package com.itlsr.d3_static_test;

public class Login {
    public static void main(String[] args) {
        // 验证码：
        System.out.println("验证码：" + VerifyTool.createCode(10));
    }
}
