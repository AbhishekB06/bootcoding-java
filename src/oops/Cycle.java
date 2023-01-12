package oops;

public class Cycle {
    String brand;
    String color;
    String cycleType;
    double price;
    int gears;
    String brakeType;

    public static Cycle createCycle(){
        Cycle cycle = new Cycle();
        cycle.brand = "Hero";
        cycle.color = "Crimson Red";
        cycle.cycleType = "Racing Bike";
        cycle.price = 17500.00;
        cycle.gears = 5;
        cycle.brakeType = "Disc Brakes";
        return  cycle;
    }
    public static Cycle createCycle(String b, String c, String ct, double p, int g, String bt){
        Cycle cycle = new Cycle();
        cycle.brand = b;
        cycle.color = c;
        cycle.cycleType = ct;
        cycle.price = p;
        cycle.gears = g;
        cycle.brakeType = bt;
        return  cycle;
    }
    public static void printCycle(Cycle cycle){
        System.out.println("Cycle Brand : " + cycle.brand);
        System.out.println("Cycle color : " + cycle.color);
        System.out.println("Cycle Type : " + cycle.cycleType);
        System.out.println("Cycle Price : " + cycle.price);
        System.out.println("No. of Gears : " + cycle.gears);
        System.out.println("Brake Type : " + cycle.brakeType);
    }
}
