package poly.Car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        K3Car K3Car = new K3Car();
        driver.setCar(K3Car);
        driver.drive();

        //차량 변경(k3 -> model3Car)
        Model3Car Model3Car = new Model3Car();
        driver.setCar(Model3Car);
        driver.drive();

        //차량 변경(model3Car -> NewCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
