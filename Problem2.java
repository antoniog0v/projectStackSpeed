/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.problem2;

import java.util.*;

public class Problem2 {

    public static void main(String[] args) {
        // amount of operations that we are testing with
        int amtOfOperations = 1000000;

        //System.nanoTime() gives the amount of time that it takes for the JVM to run the program
        float arrayStartTime = System.nanoTime();
        arrayStackSpeed(amtOfOperations);
        //Subtracting the amount of time it took to start from the actual time it took to run
        float arrayDuration = System.nanoTime() - arrayStartTime;

        
        float linkedListStartTime = System.nanoTime();
        linkedListStackSpeed(amtOfOperations);
         //Subtracting the amount of time it took to start from the actual time it took to run
        float linkedListDuration = System.nanoTime() - linkedListStartTime;

         // Gives both times that it took to run (Divided by 1e6 so its not an extremely long number)
        System.out.println("Array-based Stack Duration: " + arrayDuration / 1e6 + " ms");
        System.out.println("Linked List-based Stack Duration: " + linkedListDuration / 1e6 + " ms");
    }
    // an array that runs 1000000 pushes and 1000000 pops
    private static void arrayStackSpeed(int o) {
        ArrayDeque<Integer> arrayStack = new ArrayDeque<>();
        for (int i = 0; i < o; i++) {
            arrayStack.push(i);
        }
        for (int i = 0; i < o; i++) {
            arrayStack.pop();
        }
    }
    // a linked list that runs 1000000 pushes and 1000000 pops
    private static void linkedListStackSpeed(int operations) {
        LinkedList<Integer> linkedListStack = new LinkedList<>();
        for (int i = 0; i < operations; i++) {
            linkedListStack.push(i);
        }
        for (int i = 0; i < operations; i++) {
            linkedListStack.pop();
        }
    }
}