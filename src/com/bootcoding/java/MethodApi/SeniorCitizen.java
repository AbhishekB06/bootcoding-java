package com.bootcoding.java.MethodApi;

public class SeniorCitizen {
    public static void main(String[] args) {
        int[] ages = {12, 15, 25, 26, 27, 30};
        boolean result = isSeniorCitizen(ages);
        System.out.println(isSeniorCitizen(ages));
    }
    public static boolean isSeniorCitizen(int[] ages){
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] >= 60) {
                return true;
            }
        }
        return false;
    }
}

