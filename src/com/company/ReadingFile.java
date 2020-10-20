package com.company;
import java.io.*;

public class ReadingFile {
    public static void main(String[] args){
        File file = null;
        String[] paths;

        try{
           // Create new file object
            file = new File("/tmp");

            // Array of files and directories
            paths = file.list();

            // For each name in the path array
            for(String path:paths){
                System.out.println(path);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
