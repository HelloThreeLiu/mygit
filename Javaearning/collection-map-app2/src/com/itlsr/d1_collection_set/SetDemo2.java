package com.itlsr.d1_collection_set;

public class SetDemo2 {
    public static void main(String[] args) {
        // 目标：学会获取对象的哈希值，并确认一下
        String name = "itliusr";
        System.out.println(name.hashCode());
        System.out.println(name.hashCode());

        String name1 = "itliusr1";
        System.out.println(name1.hashCode());
        System.out.println(name1.hashCode());
    }
}
