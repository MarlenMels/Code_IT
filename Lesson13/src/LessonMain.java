import howToPrintClassesThatInOtherClasses.Body;
import howToPrintClassesThatInOtherClasses.Car;
import howToPrintClassesThatInOtherClasses.Engine;
import howToPrintClassesThatInOtherClasses.Wheels;

public class LessonMain {
    static void main() {

        Body body = new Body("Sedan");
        Wheels wheels = new Wheels(4);
        Engine engine = new Engine("BWM", 4.6);

        Car car = new Car(engine, body, wheels);

        System.out.println(car);


    }
}
