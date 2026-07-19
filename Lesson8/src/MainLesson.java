import java.util.Random;

public class MainLesson {
    public static void main(String[] args) {
        double[] people = new double[5000];
        for(int i = 0; i < people.length; i++){
            people[i] = new Random().nextInt(100);
        }

        double summ = 0;
        for(int i = 0; i < people.length; i++){
            summ += people[i];
        }

        System.out.println("Average age: " + summ / people.length);
    }
}
