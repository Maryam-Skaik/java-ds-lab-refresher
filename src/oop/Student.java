/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Maryam
 */
public class Student {
    
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    //public Student(){}

    public String getName() { return name; }
    public int getId() { return id; }
    
    public void setName(String name){
        this.name = name;
    }
    
    public static void main(String[] args) {
        Student s = new Student("Maryam", 1234);
    }
}
