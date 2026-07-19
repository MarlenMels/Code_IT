package HW8.Task1.src;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new Random().nextInt(6767);
        }
        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println();
        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }

        System.out.println();
        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
