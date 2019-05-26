import factory.Factory;
import vehicles.Car;
import vehicles.Vehicle;

public class FactoryMethod {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Vehicle car = factory.getVehicle("car");
        Vehicle motorcycle = factory.getVehicle("motorcycle");
        Vehicle ship = factory.getVehicle("ship");

        System.out.println(car.getWheel());
        System.out.println(motorcycle.getWheel());
        System.out.println(ship.getWheel());

    }
}
