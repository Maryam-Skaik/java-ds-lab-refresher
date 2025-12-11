package generics;

/**
 * Demonstrates a simple generic method that works with any data type.
 */
public class GenericMethod {

    /**
     * Prints the given item, regardless of its type.
     *
     * @param item the value to display
     */
    public <T> void show(T item) {
        System.out.println("Item: " + item);
    }
}
