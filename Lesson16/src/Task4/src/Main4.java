package Task4.src;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        //todo Numbers
        String number = new Scanner(System.in).nextLine();
        number = number.replaceAll("\\D", "");

        if(number.length() == 10){
            number = "7" + number;
        }

        if(number.length() == 11){
            if(number.startsWith("7")){
                System.out.println(number);
            } else if(number.startsWith("8")){
                number = "7" + number.substring(1);
                System.out.println(number);
            } else {
                System.out.println("Wrong number!");
                return;
            }
        } else {
            System.out.println("Wrong number!");
            return;
        }

        System.out.println(number.replaceAll("(\\d)(\\d\\d\\d)(\\d\\d\\d)(\\d\\d)(\\d\\d)", "+$1($2)-$3-$4-$5"));

    }
}
//+7(708)-311-12-47