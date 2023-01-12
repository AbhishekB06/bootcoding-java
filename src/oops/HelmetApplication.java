package oops;

public class HelmetApplication {
    public static void main(String[] args) {
        Helmet h1 = Helmet.createHelmet();
        Helmet h2 = Helmet.createHelmet("Steelbird", "White and Purple", "Full", 2670.00);
        Helmet.printHelmet(h1);
        Helmet.printHelmet(h2);
    }
}
