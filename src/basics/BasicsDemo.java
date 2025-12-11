package java.ds.lab.refresher.basics;

/**
 * Demonstrates Java basic syntax: variables, loops, methods, and objects.
 */
public class BasicsDemo {

    public static void main(String[] args) {

        // Primitive data types
        int x = 10;
        double y = 3.14;
        boolean flag = true;

        // Simple if-statement
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        // Loop without initialization section
        int i = 0;
        for (; i < 3; ) {
            System.out.println("i = " + i);
            i++;
        }

        // Calling static method
        System.out.println(sum(4, 6));

        // Calling instance method
        System.out.println(new BasicsDemo().multiply(4, 6));
    }

    // Static method example
    public static int sum(int a, int b) {
        return a + b;
    }

    // Instance method example
    public int multiply(int a, int b) {
        return a * b;
    }
}
