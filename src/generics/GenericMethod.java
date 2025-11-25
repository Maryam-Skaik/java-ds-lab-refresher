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
public class GenericMethod {
    public <T> void show(T item) {
        System.out.println("Item: " + item);
       // return item;
    }
}
