package com.itlsr.d6_abstract_class;

public abstract class Animal {
    private String name;

    public abstract void run();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
