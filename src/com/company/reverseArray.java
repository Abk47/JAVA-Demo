package com.company;
import java.util.*;

public class reverseArray {
//    A function that reverses elements of an Array
    static void reverse(String[] a){
    Collections.reverse(Arrays.asList(a));
    System.out.println(Arrays.asList(a));
    }

    public static void main(String...args){
        String a[] = {"Eye","Nose","Ears","Face"};
        reverse(a);
    }
}
