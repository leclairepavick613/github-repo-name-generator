  package com.github.java;

import java.util.Random;

public class RandomJavaCode {
    public static void main(String[] args) {
        // Generate a random number between 1 and 10
        int num = new Random().nextInt(10) + 1;

        // Print the number
        System.out.println("Random number: " + num);
    }
}