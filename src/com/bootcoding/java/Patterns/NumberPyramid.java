package com.bootcoding.java.Patterns;

public class NumberPyramid {
    public static void main(String[] args) {
        int row = 4;
        int n = 0;
        for (int i = 1; i <= row ; i++){
            for (int j = row - 1; j >= i; j--){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
