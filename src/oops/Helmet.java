package oops;

public class Helmet {
    String brand;
    String color;
    String type;
    double price;

    public static Helmet createHelmet(){
        Helmet helmet = new Helmet();
        helmet.brand = "Vega";
        helmet.color = "Matte Black";
        helmet.type = "Half";
        helmet.price = 1250.00;
        return helmet;
    }
    public static Helmet createHelmet(String b, String c, String t, double p){
        Helmet helmet = new Helmet();
        helmet.brand = b;
        helmet.color = c;
        helmet.type = t;
        helmet.price = p;
        return helmet;
    }
    public static void printHelmet(Helmet helmet){
        System.out.println("Helmet Brand : " + helmet.brand);
        System.out.println("Helmet Color : " + helmet.color);
        System.out.println("Helmet Type : " + helmet.type);
        System.out.println("Helmet Price : " + helmet.price);
    }
}
