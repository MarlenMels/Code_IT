import java.text.DecimalFormat;
import java.util.Scanner;

public class LessonHW3_2 {
    public static void main(String[] args) {
        DecimalFormat moneyFormat = new DecimalFormat("###,##0.00");
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\tWelcome to the currency convertor from ₽ to $ and €!");
        System.out.print("Enter the amount of ₽: ");
        double rub = sc.nextDouble();
        double usd = rub / 78.10;
        double eur = rub / 89.32;
        System.out.println("\nAmount of $: " + moneyFormat.format(usd));
        System.out.println("Amount of €: " + moneyFormat.format(eur));
    }
}
