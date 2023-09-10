package com.sachin.GetAPIMailIntegration;

public class MyObject {
    private final String name;
    private final int age;


    public MyObject(String name, int age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public String toString() {
        return "MyObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
