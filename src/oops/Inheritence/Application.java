package oops.Inheritence;

public class Application {
    public static void main(String[] args) {
        ComputerTable ct = new ComputerTable();
        ct.legs = 4;
        ct.tableTop = true;
        ct.material = new Material();
        ct.tableType = "Computer";
        ct.createTable();
        ct.move();

        DiningTable dt = new DiningTable();
        dt.legs = 4;
        dt.tableTop = true;
        dt.material = new Material();
        dt.tableType = "Dining";
        dt.createTable();
        dt.move();

        DressingTable drt = new DressingTable();
        drt.legs = 4;
        drt.tableTop = true;
        drt.material = new Material();
        drt.tableType = "Dressing";
        drt.createTable();
        drt.move();

        MobileAmbulance ma = new MobileAmbulance();
        ma.assignCharges();
    }
}
