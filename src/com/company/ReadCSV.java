package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSV {

    public static void main(String[] args) {
    File file = new File("username.csv");
    try{
        Scanner inputStream = new Scanner(file);
        while(inputStream.hasNext()){
            String data = inputStream.nextLine(); //Gets a whole line
            System.out.println(data);
        }
        inputStream.close();
    }
    catch(FileNotFoundException e){
        e.printStackTrace();
    }
    }
}
