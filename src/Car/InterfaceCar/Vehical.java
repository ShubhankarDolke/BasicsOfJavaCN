package Car.InterfaceCar;

public class Vehical implements VehicalInterface {



    @Override
    public boolean isMoto() {
        return false;
    }

    @Override
    public String getCompany() {

        return "bmw";

    }

    public void print() {
        System.out.println("1");
    }
}
