package internal;

public class Bike extends TwoWheeler{

    @Override
    public void ride() {
        System.out.println("Bike is riding on the highway");
    }

    public void accelerate() {
        System.out.println("Bike is accelerating fast");
    }
}
