package oops;

public class Application {
    public static void main(String[] args){
        Marker marker = new Marker();
        marker.brand = "Camlin";
        marker.type = "Whiteboard Marker";
        marker.color = "Blue";
        marker.price = 150.01;

        marker.refill();
        marker.write(" I am learning OOPs in Java");
        marker.print();

        Car car = new Car();
        car.color = "Black";
        car.model = "Supra";
        car.brandName = "Toyota";
        car.lights = 10;
        car.seats = 2;
        car.fuelType = "Diesel";

        car.startEngine();
        car.stopEngine();
        car.move();
        car.print();
    }
}
