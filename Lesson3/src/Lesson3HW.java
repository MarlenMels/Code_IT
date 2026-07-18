import java.text.DecimalFormat;
import java.util.Scanner;

public class Lesson3HW {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("###,##0.00");
        System.out.println("Welcome to the convertor from Celsius to Fahrenheit!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter in Celsius: ");
        double input = sc.nextDouble();
        double output = (input * 1.8) + 32;
        System.out.println("\nAnswer in Fahrenheit: " + format.format(output));
    }
}
