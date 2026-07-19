package HW8.Task2.src;

import java.text.DecimalFormat;
import java.text.Format;

public class Main2 {
    public static void main(String[] args) {
        //todo код программы писать тут
        DecimalFormat df = new DecimalFormat("###,##0.00");
        double[] weightsOfPeople = new double[10];
        for(int i = 0; i < weightsOfPeople.length; i++){
            weightsOfPeople[i] = Math.random() * (100 - 40) + 40;
        }
        System.out.println("Weights of 10 people: ");
        for(int i = 0; i < weightsOfPeople.length; i++){
            System.out.println(df.format(weightsOfPeople[i]));
        }

        double summa = 0;
        for(int i = 0; i < weightsOfPeople.length; i++){
            summa += weightsOfPeople[i];
        }
        System.out.println("Average weight: " + df.format(summa / weightsOfPeople.length));

        System.out.println("Weights that is greather than 40 and lower than 60: ");
        for(int i = 0; i < weightsOfPeople.length; i++){
            if(weightsOfPeople[i] < 40 || weightsOfPeople[i] > 60){
                continue;
            }
            System.out.println(df.format(weightsOfPeople[i]));
        }
    }
}
