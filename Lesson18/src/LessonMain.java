public class LessonMain {
    public static void main(String[] args) {
        //inheritance
        //polymorphism
        //encapsulation
        //abstraction

        Sedan sedan = new Sedan("Lada", 1.6, 300);
        sedan.signal();
        sedan.move();

        Truck truck = new Truck("Volvo", 2.0, 200);
        truck.signal();
        truck.move();

        ElectricCar electricCar = new ElectricCar("Tesla", null, 300);
        electricCar.signal();
        electricCar.move();
    }
}
