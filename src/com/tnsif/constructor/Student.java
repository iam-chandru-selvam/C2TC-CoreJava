package com.tnsif.constructor;

public class Student {
    int age;
    String name;

    // Parameterized constructor
    Student(int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("Constructor called -> Age -> "+this.age+" Name ->"+this.name+" ");
    }
    //method 
    void student1(int age, String name) {
    	this.age=age;
    	this.name=name;
    	
    }
    public static void main(String[] args) {

        Student obj = new Student(20, "Hari"); //constructor called 
        obj.student1(21,"Hariharan");
        System.out.println("From method -> "+obj.age+" "+obj.name);

    }
}