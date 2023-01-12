package oops;

public class DusterApplication {
    public static void main(String[] args) {
        Duster d1 = Duster.createDuster();
        Duster d2 = Duster.createDuster("Camlin", "Blackboard", "Flat", 90.00);
        Duster.printDuster(d1);
        Duster.printDuster(d2);
    }
}
