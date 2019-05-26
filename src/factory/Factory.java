package factory;

import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Ship;
import vehicles.Vehicle;

public class Factory {

    public Factory(){
    }

    public Vehicle getVehicle(String type){
        switch (type){
            case "car":
                return new Car();
            case "motorcycle":
                return new Motorcycle();
            case "ship":
                return new Ship();
            default:
                return null;
        }
    }
}
