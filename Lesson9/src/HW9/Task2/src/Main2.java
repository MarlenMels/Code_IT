package HW9.Task2.src;

import java.util.Scanner;

public class Main2 {
    public static int inputNum;
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        inputNum = input();
        checkNum();
    }

    private static int input() {
        System.out.println("Enter the input number: ");
        return new Scanner(System.in).nextInt();
    }

    public static void checkNum(){
        if(inputNum % 2 == 0){
            System.out.println("Your number is even");
            System.out.println(true);
        } else {
            System.out.println("Your number is odd");
            System.out.println(false);
        }
    }
}
