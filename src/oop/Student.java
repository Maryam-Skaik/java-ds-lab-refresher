package oop;

/**
 * Simple Student class demonstrating encapsulation and constructors.
 */
public class Student {

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public int getId() { return id; }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student s = new Student("Maryam", 1234);
    }
}
