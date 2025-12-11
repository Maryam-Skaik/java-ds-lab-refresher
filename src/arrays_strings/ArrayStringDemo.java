package arrays_strings;

/**
 * Demonstrates basic array usage and String operations in Java.
 * This file is part of the Java Refresher module for the DS Lab.
 */
public class ArrayStringDemo {

    public static void main(String[] args) {

        // Static array initialization
        int[] arr = {10, 20, 30, 40};

        // Creating an array with predefined size
        int[] a = new int[5];
        int b = 6; // normal variable (not an array)

        // Accessing array element by index
        System.out.println(arr[2]); // prints 30

        // Enhanced for-loop (for-each) to traverse an array
        for (int num : arr) {
            System.out.println(num);
        }

        // String operations
        String s = "Hello";
        System.out.println(s.toUpperCase()); // outputs "HELLO"
    }
}
