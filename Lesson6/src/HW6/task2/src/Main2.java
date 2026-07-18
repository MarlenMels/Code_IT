package HW6.task2.src;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;
        //todo дописать логику программы ниже.


//      1 solution:
//        if(first > second && first > third){
//            greatest = first;
//            if(second > third){
//                average = second;
//                smallest = third;
//            } else {
//                average = third;
//                smallest = second;
//            }
//        } else if(second > first && second > third){
//            greatest = second;
//            if(first > third){
//                average = first;
//                smallest = third;
//            } else {
//                average = third;
//                smallest = first;
//            }
//        } else if(third > first && third > second){
//            greatest = third;
//            if(first > second){
//                average = first;
//                smallest = second;
//            } else {
//                average = second;
//                smallest = first;
//            }
//        }


        //2 solution:
//        greatest = Double.max(first, Double.max(second, third));
//        smallest = Double.min(first, Double.min(second, third));
//
//        if(first != greatest && first != smallest) average = first;
//        if(second != greatest && second != smallest) average = second;
//        if(third != greatest && third != smallest) average = third;


        //3 solution:
        greatest = first > second && first > third ? first : second > first && second > third ? second : third;
        smallest = first < second && first < third ? first : second < first && second < third ? second : third;
        average = (first > second && first < third) || (first < second && first > third) ? first : (second > first && second < third) || (second < first && second > third) ? second : third;

        //todo


        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}
