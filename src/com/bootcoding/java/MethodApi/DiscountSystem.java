package com.bootcoding.java.MethodApi;

public class DiscountSystem {
    public static void main(String[] args) {
        int[] shoppingFrequency = {6,5,8,7,10,3,4,0,2,12,15};
        int[] finalDiscount = calculateDiscount(shoppingFrequency);
        for (int i = 0; i < finalDiscount.length; i++) {
            System.out.println("Shopped " + shoppingFrequency[i] + " times " + " = Customer gets " + finalDiscount[i] + "% discount");
        }
    }
    public static int[] calculateDiscount(int[] shoppingFrequency){
        int[] discounts = new int[shoppingFrequency.length];
        for(int i = 0; i < shoppingFrequency.length; i++) {
            int discount;
            int frequency = shoppingFrequency[i];
            discount = getDiscount(frequency);
            discounts[i] = discount;
        }
        return discounts;
    }
    private static int getDiscount(int frequency){
        int discount;
        if(frequency < 1){
            discount = 50;
        }else if(frequency < 5 && frequency >= 1){
            discount = 30;
        }else if(frequency < 7 && frequency >= 5){
            discount = 20;
        }else if(frequency < 10 && frequency >= 7){
            discount = 10;
        }else {
            discount = 0;
        }
        return discount;
    }

}
