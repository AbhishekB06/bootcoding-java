package oops.Assignment.Discount;

import java.util.Random;

public class OrderCountGenerator {
    final static int MAX = 1000;
    final  static  int MIN = 1;
    public static int getOrderCount;
    static Random random = new Random();
    
    public static int getOrderCount(){
        return MIN + random.nextInt(MAX - MIN);
    }
}
