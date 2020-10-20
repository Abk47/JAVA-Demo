package com.company;

public class Main {
// function that displays a Fibonacci series sequence
    public static void main(String...args) {
        int count = 7, num1 = 1, num2 = 2;
        System.out.println("The Fibonacci series for the "+count+" numbers.");

        for(int i = 1; i <= count; i++){
            System.out.print(num1 + ",");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}



