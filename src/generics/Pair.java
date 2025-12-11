package generics;

/**
 * A simple generic class that stores two values of possibly different types.
 *
 * @param <T> type of the first value
 * @param <U> type of the second value
 */
public class Pair<T, U> {

    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() { return first; }
    public U getSecond() { return second; }

    public static void main(String[] args) {

        // Using generics with String and Integer
        Pair<String, Integer> p = new Pair<>("Maryam", 21);

        // Using generics with two integers
        Pair<Integer, Integer> p2 = new Pair<>(5, 3);

        // Calling a generic method
        new GenericMethod().show("Maryam");
    }
}
