package com.itlsr.d7_extends;

public class Student extends People{
    /**
       独有的行为
     */
    public void study(){
        System.out.println(getName() + "学生开始学习~~~~~");
    }
}
