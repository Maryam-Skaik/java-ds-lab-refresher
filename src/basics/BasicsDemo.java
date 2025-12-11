/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.ds.lab.refresher.basics;

/**
 *
 * @author Maryam
 */
public class BasicsDemo {
    public static void main(String[] args) {
        // Java Basics
        int x = 10;
        double y = 3.14;
        boolean flag = true;

        if (x > 5) {
            System.out.println("x is greater than 5");
        }
        
        int i = 0;
        for (; i < 3; ) {
            System.out.println("i = " + i);
            i++;
        }
        
        

        System.out.println(sum(4, 6));  
        System.out.println(new BasicsDemo().multiply(4, 6));  
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
}
