package com.company;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String...args){
        int width;
        int height;

        System.out.println("Enter the width of the triangle: ");
        Scanner input = new Scanner(System.in);
        width = input.nextInt();

        System.out.println("Enter the height of the triangle: ");
        Scanner input1 = new Scanner(System.in);
        height = input1.nextInt();

        double area = 0.5 * width * height;
        System.out.println("The Area of the triangle is :" +area);
    }
}
