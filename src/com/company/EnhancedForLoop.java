package com.company;

public class EnhancedForLoop {
    public static void main(String[] args){
        int[] num = {1,2,3,4,5};
        for(int x:num){
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println();

//        Looping through another String Array
        String[] names = {"Lilian","Peter","Jane","Smith"};
        for(String name:names){
            System.out.print(name);
            System.out.print(",");
        }
    }
}
