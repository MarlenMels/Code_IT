package Task1.src;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Создание объекта через полный конструктор
        Wine wine = new Wine(
                "Cabernet Sauvignon",
                "Château Margaux",
                "France",
                LocalDate.of(2015, 9, 20),
                "Насыщенное красное вино с нотами чёрной смородины"
        );

        // Проверка геттеров
        System.out.println("Название: " + wine.getName());
        System.out.println("Марка: " + wine.getTrademark());
        System.out.println("Страна: " + wine.getCountry());
        System.out.println("Дата розлива: " + wine.getBottlingDate());
        System.out.println("Описание: " + wine.getDescription());

        // Проверка расчёта выдержки
        int age = wine.countYearsOfWine(LocalDate.of(2026, 7, 30));
        System.out.println("Выдержка на 30.07.2026: " + age + " лет");

        // Проверка сеттеров
        wine.setDescription("Обновлённое описание вина");
        wine.setTrademark("Château Latour");
        System.out.println("\nПосле изменений:");
        System.out.println("Марка: " + wine.getTrademark());
        System.out.println("Описание: " + wine.getDescription());

        // Создание через пустой конструктор + сеттеры
        Wine wine2 = new Wine();
        wine2.setName("Pinot Noir");
        wine2.setTrademark("Domaine Leroy");
        wine2.setCountry("France");
        wine2.setBottlingDate(LocalDate.of(2020, 3, 10));
        wine2.setDescription("Лёгкое вино с фруктовым вкусом");

        System.out.println("\nВторое вино:");
        System.out.println("Название: " + wine2.getName());
        int age2 = wine2.countYearsOfWine(LocalDate.of(2026, 7, 30));
        System.out.println("Выдержка: " + age2 + " лет");
    }
}