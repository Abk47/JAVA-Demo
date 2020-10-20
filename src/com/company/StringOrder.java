package com.company;
import java.util.*;

public class StringOrder {
    public static void main(String[] args){
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);

        // User asked to enter string count
        System.out.print("Enter number of names you would like to enter: ");
        count = scan.nextInt();

        // Allowing user to enter names in the array and store them
        String[] names = new String[count];
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Enter the "+ count + " names one by one: ");
        for(int i = 0; i < count; i++){
            names[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();

        // Sorting the array alphabetically before printing
        Arrays.sort(names);

        // Printing the array
        System.out.print(Arrays.toString(names));
    }
}
