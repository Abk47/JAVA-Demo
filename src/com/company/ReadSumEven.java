package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ReadSumEven {
    static void createFile(){
        try{
            File name = new File("Numbers.txt");
            if(name.createNewFile()){
                System.out.println("File created: " +name.getName());
            } else{
                System.out.println("File already exists!");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    static void WriteToFile() {
        try {
            FileWriter list = new FileWriter("Numbers.txt");
            for(int i = 0; i <= 100; i++){
                String a = String.valueOf(i);
                a = a + ' ';
                list.write(a);
            }
                list.close();
            System.out.println("Operation Successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void ReadAndCalculate() {
            File numberData = new File("Numbers.txt");
        try {
            Scanner inputStream = new Scanner(numberData);
            while (inputStream.hasNext()) {
                int number = inputStream.nextInt();
                System.out.println(number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        createFile();
        WriteToFile();
        ReadAndCalculate();
    }
}
