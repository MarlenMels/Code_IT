package Task4.src;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main4 {

    private static final String REGEX = "(\\d)(\\d\\d\\d)(\\d\\d\\d)(\\d\\d)(\\d\\d)";
    private static final String NUMBER_FORMAT = "+$1($2)-$3-$4-$5";

    public static void main(String[] args) {
        //todo Numbers
        while (true) {
            String number = new Scanner(System.in).nextLine();
            number = number.replaceAll("\\D", "");
            if (number.length() == 10) {
                number = "7" + number;
            }
            if (number.startsWith("8")) {
                number = number.replaceAll("^\\d", "7");
            }
            if (number.length() == 11 && number.startsWith("7")) {
                System.out.println(number.replaceAll(REGEX, NUMBER_FORMAT));
            } else {
                System.out.println("Wrong number");
            }

        }

    }
}
