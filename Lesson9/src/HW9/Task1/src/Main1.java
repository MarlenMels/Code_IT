package HW9.Task1.src;


import java.util.Scanner;

public class Main1 {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        a = inputDouble();
        b = inputDouble();

        sum();      //Метод суммирования чисел
        multiply(); //Метод умножения чисел
        diff();     //Метод вычитания чисел
        divide();   //Метод деления чисел
    }

    private static void divide() {
        //todo дописать логику и печать результата
        if (b == 0) {
            System.out.println("You cannot divide to 0");
        } else {
            System.out.println("Division of two numbers equal: " + (a / b));
        }
    }

    private static void diff() {
        //todo дописать логику и печать результата
        System.out.println("Difference of two numbers equal: " + (a - b));
    }

    private static void multiply() {
        //todo дописать логику и печать результата
        System.out.println("TMultiplication of two numbers equal: " + (a * b));
    }

    private static void sum() {
        //todo дописать логику и печать результата
        System.out.println("Summation of two numbers equal: " + (a + b));
    }

    private static double inputDouble() {
        //todo дописать логику
        System.out.println("Enter the number: ");
        return new Scanner(System.in).nextDouble();
    }
}
