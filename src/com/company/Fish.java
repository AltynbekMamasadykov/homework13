package com.company;

public class Fish {
    private String name;
    private int age;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void getInfo(){
        System.out.println("Fish Name: "+getName());
        System.out.println("age: "+getAge());
        System.out.println("color: "+getColor());
    }
}
