package oops;

public class Car {
    public String color;
    public String model;
    public String brandName;
    public int lights;
    public int seats;
    public String fuelType;

    public void startEngine() {
        System.out.println("Car has started");
    }
    public void stopEngine() {
        System.out.println("Car has stopped");
    }
    public void move() {
        System.out.println("Car is moving");
    }
    public void print(){
        System.out.println("Color of the car :" + color);
        System.out.println("Model of the car :" + model);
        System.out.println("Brand of the car :" + brandName);
        System.out.println("Lights in the car :" + lights);
        System.out.println("Seats in the car :" + seats);
        System.out.println("Fuel type of the car :" + fuelType);
    }
}
