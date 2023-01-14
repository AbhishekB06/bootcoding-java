package oops.Assignment.Discount;

import java.util.Random;

public class VisitCountGenerator {

    final static int MAX = 1000;
    final  static  int MIN = 1;
    static Random random = new Random();

    public static int getVisitCount(){
        return MIN + random.nextInt(MAX - MIN);
    }
}
