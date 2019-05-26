package vehicles;

public class Ship implements Vehicle {

    public Ship(){
    }

    @Override
    public void speedUp() {
        System.out.println("Throttle trigger");
    }

    @Override
    public void brake() {
        System.out.println("Brake");
    }

    @Override
    public Integer getWheel() {
        return 0;
    }
}
