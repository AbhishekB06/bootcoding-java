package oops;

public class CycleApplication {
    public static void main(String[] args) {
        Cycle c1 = Cycle.createCycle();
        Cycle c2 = Cycle.createCycle("Hercules", "Tank Green", "Mountain Bike", 16600.00, 0, "Disc Brakes");
        Cycle.printCycle(c1);
        Cycle.printCycle(c2);

        RaceCycle rc = new RaceCycle();
        RaceCycle.createCycle();
        RaceCycle.printCycle(c1);

        MountainCycle mc = new MountainCycle();
        MountainCycle.createCycle();
        MountainCycle.printCycle(c2);


    }
}
