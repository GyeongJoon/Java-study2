package poly.Car1;

public class K3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("K3Car.startEnigine");
    }

    @Override
    public void offEngine() {
        System.out.println("K3Car.offEnigine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3Car.pressAccelerator");
    }
}
