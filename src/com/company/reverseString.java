package com.company;

public class reverseString {
    public static void main(String[] args) {
        String str = "Doreen is beautiful";
        String[] arr = str.split(" ");

        for( String x: arr){
            System.out.print(x + " ");
        }
    }
}

