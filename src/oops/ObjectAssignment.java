package oops;

public class ObjectAssignment {
    public static void main(String[] args) {
        //primitive data types

        int a = 10;
        float b = a;//b <- a (value of a)
        b = 30;//b - changing but  not changing a
        System.out.println("A ki value = " + a);
        System.out.println("B ki value = " + b);

        //ADT - abstract data type
        Marker blueMarker = new Marker();
        Marker redMarker = blueMarker;// redMarker <- BlueMarker(refernce)
        blueMarker.color = "Blue";
        redMarker.color = "Red";
        System.out.println("BlueMarker value = " + blueMarker.color);
        System.out.println("RedMarker value = " + redMarker.color);
    }
}