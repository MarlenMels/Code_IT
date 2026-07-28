package HW.Task2.src;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main2 {
    public static final String ALPHABET = " АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static void main(String[] args) {
        //todo код писать тут. По желанию(рекомендуется) вынести код в методы.

        String fio = new Scanner(System.in).nextLine().trim();
        boolean isValid = true;
        int spaceCounter = 0;
        for (int i = 0; i < fio.length(); i++) {
            if (fio.charAt(i) == ' ') {
                spaceCounter++;
            }
            if(!ALPHABET.contains(String.valueOf(fio.charAt(i)))){
                isValid = false;
                break;
            }
        }

        if (spaceCounter == 2 && isValid) {
            System.out.println("Surname: " + returnSurname(fio));
            System.out.println("Name: " + returnName(fio));
            System.out.println("Father's name: " + returnFathersName(fio));
        } else {
            System.out.println("The entered string is not a full name");
        }
    }

    public static String returnSurname(String fio) {
        return fio.substring(0, fio.indexOf(' ')).trim();
    }

    public static String returnName(String fio) {
        return fio.substring(fio.indexOf(' '), fio.lastIndexOf(' ')).trim();
    }

    public static String returnFathersName(String fio) {
        return fio.substring(fio.lastIndexOf(' ')).trim();
    }
}