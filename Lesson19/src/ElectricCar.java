public class ElectricCar extends Car {
    public ElectricCar(String mark, Double engineVolume, Integer maxSpeed) {
        super(mark, engineVolume, maxSpeed);
    }

    public ElectricCar() {
    }

    @Override
    public void move(){
        System.out.println("Electric car is moving" + super.getMaxSpeed());
    }
}
