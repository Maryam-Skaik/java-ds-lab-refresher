/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Maryam
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
        Pair<String, Integer> p = new Pair("Maryam", 21);
        Pair<Integer, Integer> p2 = new Pair(5, 3);
        
        new GenericMethod().show("Maryam");
    }
}