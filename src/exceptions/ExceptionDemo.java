/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Maryam
 */
public class ExceptionDemo {
    
    public static void main(String[] args) throws FileNotFoundException{
        try {
            readFile();
            int a = 10 / 10;
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }finally{
            System.out.println("done");
        }
    }
    
    public static void readFile() {
        try{
        FileReader fr = new FileReader("text.txt");
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            
        }catch(Exception e){
            
        }
    }
}
