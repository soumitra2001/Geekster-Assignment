package com.geekster.SpringAnnotation;

public class Student {
    private String name;

    public Student(){
        System.out.println("Student's non Params Constructor gets called ");
    }
    public Student(String name){
        System.out.println("Student Constructor gets called ");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString(){
        return "We have a new Student"+name;
    }
}
