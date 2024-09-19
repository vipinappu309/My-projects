/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javatestproject;
import java.util.Arrays;
/**
 *
 * @author vipin
 */
public class testjava {

    /**
     * @param args the command line arguments
     * 
     */

    
    public static void main(String args[]) {
        // TODO code application logic here
         String[] fruits = {"Banana", "Apple", "Orange", "Mango", "Grapes"};

        // Print the original array
        System.out.println("Original array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Sort the array alphabetically
        Arrays.sort(fruits);

        // Print the sorted array
        System.out.println("\nSorted array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
