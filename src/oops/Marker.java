package oops;

public class Marker {
    public String type;
    public String brand;
    public String color;
    public double price;
    public void refill() {
        System.out.println("Refill marker successfully");
    }
    public void write(String message){
        System.out.println("On white board" + message);
    }
    public void print(){
        System.out.println("Marker brand :" + brand);
        System.out.println("Marker type :"+ type);
        System.out.println("Marker color :"+ color);
        System.out.println("Marker price :"+ price);
    }
}
