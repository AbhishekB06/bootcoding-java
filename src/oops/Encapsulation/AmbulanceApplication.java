package oops.Encapsulation;

public class AmbulanceApplication {
    public static void main(String[] args) {
        Ambulance amb = new Ambulance();
        amb.setHospitalName("Neuron");
        amb.setType("Van");
        amb.setCharges(3500);
        amb.setAvailable(true);

        System.out.println("Ambulance info : \n");
        System.out.println("Hospital Name : " + amb.getHospitalName());
        System.out.println("Hospital Name : " + amb.getType());
        System.out.println("Hospital Name : " + amb.getCharges());
        System.out.println("Hospital Name : " + amb.isAvailable());

    }
}
