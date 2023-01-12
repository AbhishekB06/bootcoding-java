package oops;

public class BoxApplication {
    public static void main(String[] args) {
        Box b1 = Box.createBox();
        Box b2 = Box.createBox(7.5,2.5,5.5);
        Box.printBox(b1);
        Box.printBox(b2);
    }
}
