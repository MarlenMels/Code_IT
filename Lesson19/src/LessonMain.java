public class LessonMain {
    public static void main(String[] args) {
        //inheritance
        //polymorphism
        //encapsulation
        //abstraction

        Car sedan = new Sedan("Lada", 1.6, 300);
        sedan.signal();
        sedan.move();

        Car truck = new Truck("Volvo", 2.0, 200);
        truck.signal();
        truck.move();

        Car electricCar = new ElectricCar("Tesla", null, 300);
        electricCar.signal();
        electricCar.move();


    }
}
