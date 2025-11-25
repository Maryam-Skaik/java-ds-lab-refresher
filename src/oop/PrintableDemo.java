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
public interface PrintableDemo {
    void print();
}

class Book implements PrintableDemo {
    public void print() { System.out.println("Printing a book..."); }
}

class Magazine implements PrintableDemo{

    @Override
    public void print() {
        System.out.println("Printing a magazine...");
    }
    
}
