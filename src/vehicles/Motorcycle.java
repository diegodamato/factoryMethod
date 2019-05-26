package vehicles;

public class Motorcycle implements Vehicle{

    public Motorcycle(){
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
        return 2;
    }
}
