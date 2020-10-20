package com.company;
import java.util.*;

public class addNumbers {
    static void sum(){
        int a;
        int b;
        String name;
      System.out.println("Enter the first number: ");
      Scanner n1 = new Scanner(System.in);
      a = n1.nextInt();

      System.out.println("Enter the second number: ");
      Scanner n2 = new Scanner(System.in);
      b = n2.nextInt();

      System.out.println("Enter your full name: ");
      Scanner n3 = new Scanner(System.in);
      name = n3.nextLine();

      int sum = a + b;
      System.out.println("Hello " + name + ", The total sum is " +sum);

    }
    public static void main(String[] args){
        sum();
    }
}
