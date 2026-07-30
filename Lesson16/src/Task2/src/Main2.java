package Task2.src;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //todo  код
        String str = new Scanner(System.in).nextLine();
        System.out.println(leaveWords(str));
    }

    //todo метод

    public static String leaveWords(String str){
        return str.replaceAll("\\W+", "\n");
    }

}