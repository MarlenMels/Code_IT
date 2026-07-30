import HW.Dog;
import HW.Duck;

public class Main {
    public static void main(String[] args) {
        //todo Реализовать класс Утка и Собака по описанным в ТЗ правилам.
        Dog dog = new Dog(20.15, 7, "Chuck");
        Duck duck = new Duck(15.15, 4, "Pidr");

        dog.move();
        duck.move();
    }
}
