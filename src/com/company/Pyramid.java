package com.company;

public class Pyramid {

    static void normalPyramid(){
        int row = 5;
        for(int i = 1; i < row; ++i){
            for(int j = 1; j <= i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invertedPyramid(){
        int row = 5;
        for(int i = row; i >= 1; --i){
            for(int j = 1; j <= i ; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
      normalPyramid();
      invertedPyramid();
    }
}
