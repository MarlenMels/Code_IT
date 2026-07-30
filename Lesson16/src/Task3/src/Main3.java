package Task3.src;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //todo ФИО
        String str = new Scanner(System.in).nextLine();
        boolean check = str.matches("([А-ЯЁа-яё-]+\\s+){2}[А-ЯЁа-яё-]+\\s*");

        if(check){
            String[] parts = str.split("\\s+");
            System.out.println("Фамилия: " + parts[0]);
            System.out.println("Имя: " + parts[1]);
            System.out.println("Отчество: " + parts[2]);
            //bad solution
//            System.out.println("Фамилия: " + str.replaceAll("\\s+[А-ЯЁа-яё-]+\\s+[А-ЯЁа-яё-]+\\s*", ""));
//            String name = str.replaceFirst("[А-ЯЁа-яё-]+\\s+", "");
//            System.out.println("Имя: " + name.replaceAll("\\s+[А-ЯЁа-яё-]+\\s*", ""));
//            System.out.println("Отчество: " + str.replaceAll("[А-ЯЁа-яё-]+\\s+", ""));
        } else {
            System.out.println("Введенная строка не является ФИО");
        }
    }
}
