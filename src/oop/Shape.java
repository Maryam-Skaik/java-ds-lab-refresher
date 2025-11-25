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
public abstract class Shape {
    public abstract void draw(); // { System.out.println("Drawing shape"); }
    
    public static void main(String[] args) {
        Circle c = new Circle();
        Shape [] shapes = {c, new Triangle()};
        
        for(Shape s: shapes){
            s.draw();
        }
    }
}
