package oop;

/**
 * Interface demonstrating polymorphism through the print() method.
 */
public interface PrintableDemo {
    void print();
}

class Book implements PrintableDemo {
    @Override
    public void print() {
        System.out.println("Printing a book...");
    }
}

class Magazine implements PrintableDemo {
    @Override
    public void print() {
        System.out.println("Printing a magazine...");
    }
}
