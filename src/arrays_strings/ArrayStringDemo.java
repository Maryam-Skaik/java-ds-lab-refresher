/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_strings;

/**
 *
 * @author Maryam
 */
public class ArrayStringDemo {
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int a [] = new int[5], b = 6;

        System.out.println(arr[2]);

        for (int num : arr) {
            System.out.println(num);
        }

        String s = "Hello";
        System.out.println(s.toUpperCase());
    }
}
