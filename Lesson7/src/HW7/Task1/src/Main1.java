package HW7.Task1.src;

import java.util.Scanner;

public class  Main1 {
    public static void main(String[] args) {
        int toadEyesCount = new Scanner(System.in).nextInt();          //Жабьи глаза
        int ghoulTearsCount = new Scanner(System.in).nextInt();        //Слезы вурдалака
        int ravenBonesCount = new Scanner(System.in).nextInt();        //Кости ворона
        int dumplingsCount = new Scanner(System.in).nextInt();         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда

        boolean check = false;
        if(toadEyesCount >= 3 && ravenBonesCount >= 1){
            System.out.println("You can make Эликсир зоркости");
            check = true;
        }
        if(ravenBonesCount >= 2 && dumplingsCount >= 4){
            System.out.println("You can make Эликсир стойкости");
            check = true;
        }
        if(ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2){
            System.out.println("You can make Эликсир скрытности");
            check = true;
        }
        if(ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3){
            System.out.println("You can make Запретный эликсир");
            check = true;
        }

        if(!check){
            System.out.println("You cannot make any Эликсир");
        }
    }
}
