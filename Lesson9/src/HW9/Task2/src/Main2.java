package HW9.Task2.src;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        print();
    }

    public static int getInput(){
        System.out.println("Enter a number: ");
        return new Scanner(System.in).nextInt();
    }

    public static void print(){
        System.out.println(getInput() % 2 == 0);
    }

}
