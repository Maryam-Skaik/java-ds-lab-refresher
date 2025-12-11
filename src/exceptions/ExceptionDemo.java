package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrates basic usage of try-catch-finally blocks
 * and working with checked exceptions such as FileNotFoundException.
 */
public class ExceptionDemo {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            readFile();   // Attempt to read a file
            int a = 10 / 10;

            // Manually throwing an exception for demonstration purposes
            throw new ArithmeticException();

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");

        } finally {
            // Always executed, whether an exception occurs or not
            System.out.println("done");
        }
    }

    /**
     * Reads a file and handles common IO-related exceptions.
     */
    public static void readFile() {
        try {
            FileReader fr = new FileReader("text.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (IOException e) {
            // Handles general input-output problems
            System.out.println("I/O error occurred");

        } catch (Exception e) {
            // Handles all other unexpected exceptions
            System.out.println("Unexpected error");
        }
    }
}
