package com.itlsr.d8_extends_test;

public class Student extends Role{
    // 独有属性
    private String className;

    // 独有行为
    public void writeInfo(){
        System.out.println(getName()
                + "说：今天学习感觉很好,老师也是666~~~");
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
