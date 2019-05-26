package vehicles;

public class Car implements Vehicle{

    private String model;

    public Car (){
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
        return 4;
    }

}
