package oops.Inheritence;

public class Table {
    int legs;
    boolean tableTop;
    String tableType;
    Material material;

    public void move(){
        System.out.println("Moving the table to another location");
    }
    public void createTable(){
        System.out.println("Create New Table");
    }
}
