package oops;

public class Duster {
    String brand;
    String type;
    String shape;
    double price;

     public static Duster createDuster(){
      Duster duster = new Duster();
      duster.brand = "Camlin";
      duster.type = "Whiteboard";
      duster.shape = "Curved";
      duster.price = 67.5;
      return duster;
     }
      public static Duster createDuster(String b, String t, String s, double p){
         Duster duster = new Duster();
         duster.brand = b;
         duster.type = t;
         duster.shape = s;
         duster.price = p;
         return duster;
      }
      public static void printDuster(Duster duster){
          System.out.println("Duster Brand : " + duster.brand);
          System.out.println("Duster Type : " + duster.type);
          System.out.println("Duster Shape : " + duster.shape);
          System.out.println("Duster Price : " + duster.price);
      }
}
