package com.bootcoding.java.Patterns;

public class RATWithIncreasingNumber {
    public static void main(String[] args) {
        int n = 4;
        int m = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(m + " ");
                m++;
            }
            System.out.println();
        }
    }
}
