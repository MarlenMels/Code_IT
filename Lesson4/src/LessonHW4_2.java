import java.util.Scanner;

public class LessonHW4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the calculator app!");
        System.out.println("Please enter the numbers!");
        System.out.print("First number: ");
        double n1 = sc.nextDouble();
        System.out.print("\nSecond number: ");
        double n2 = sc.nextDouble();
        System.out.print("\nPlease enter the action: ");
        char act = sc.next().charAt(0);
        if(act == '+'){
            System.out.println("\n" + n1 + " " + act + " " + n2 + " = " + (n1 + n2));
        } else if(act == '-'){
            System.out.println("\n" + n1 + " " + act + " " + n2 + " = " + (n1 - n2));
        } else if(act == '*'){
            System.out.println("\n" + n1 + " " + act + " " + n2 + " = " + (n1 * n2));
        } else if(act == '/'){
            System.out.println("\n" + n1 + " " + act + " " + n2 + " = " + (n1 / n2));
        }
    }
}
