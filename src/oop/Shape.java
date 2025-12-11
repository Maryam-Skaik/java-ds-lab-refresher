package oop;

/**
 * Abstract class representing a general shape.
 * Subclasses must implement the draw() method.
 */
public abstract class Shape {

    public abstract void draw();

    public static void main(String[] args) {

        Circle c = new Circle();
        Shape[] shapes = { c, new Triangle() };

        for (Shape s : shapes) {
            s.draw();
        }
    }
}
