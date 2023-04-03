package com.bootcoding.java.Assignment2;

public class PrimeEvenDigitNumber {
    public static void main(String[] args) {
        int arr[] = {17, 7, 119, 23, 1119, 9973};
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            int nums = arr[i];
            while(nums!= 0){
                nums = nums/10;
                count++;
            }

            if(count % 2 == 0){
                int dig = 0;
                int n = arr[i];
                for (int j = 2; j<n/2; j++){
                    if(n % j == 0){
                        dig++;
                       break;
                    }
                }
                if(dig == 0){
                    System.out.println(n + " is a even digit prime number");
                }
            }
        }

    }
}
