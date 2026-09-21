package bcs3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class student {

int roll;
String name;
int age;

    public student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println(roll + "  " + name + " " + age);
    }
}
