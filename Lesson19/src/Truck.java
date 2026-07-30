public class Truck extends Car{

    public Truck() {
    }

    public Truck(String mark, Double engineVolume, Integer maxSpeed) {
        super(mark, engineVolume, maxSpeed);
    }

    @Override
    public void move(){
        System.out.println("Truck is moving" + super.getMaxSpeed());
    }
}
