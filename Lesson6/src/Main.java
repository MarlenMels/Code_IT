import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // >
        // <
        // ==
        // >=
        // <=
        // !=


        boolean b = true;



        int a = new Scanner(System.in).nextInt();


        if(a > 5){
            System.out.println("Hell world");
        }
        if(a < 5){
            System.out.println("Goodbye world");
        }


        // && logical and
        // || logical or

        int a1 = new Scanner(System.in).nextInt();
        int b1 = new Scanner(System.in).nextInt();

        if(a1 > 5 && b1 < 5){
            System.out.println("HW");
        }
        if(a1 < 5 && b1 > 5){
            System.out.println("GW");
        }

        // use AND when you need satisfy 2 or more conditions at the same time
        // use OR when you need satisfy 1 condition from many conditions

        /*
        priority &&, ||
         */



        int twix = 77;
        int mars = 78;
        int snickers = 100;
        int bonAqua = 50;

        int money = new Scanner(System.in).nextInt();

        if(money >= twix){
            System.out.println("you can afford twix");
        }
        if(money >= mars){
            System.out.println("you can afford mars");
        }
        if(money >= snickers){
            System.out.println("you can afford snickers");
        }
        if(money >= bonAqua){
            System.out.println("you can afford bonAqua");
        }

    }
}
