package Task1.src;

import Task1.src.CompTask.Computer;
import Task1.src.MathTask.ArithmeticCalculator;
import Task1.src.MathTask.Operation;


import Task1.src.CompTask.HardPack.HardDrive;
import Task1.src.CompTask.HardPack.HardType;
import Task1.src.CompTask.KeyboardPack.HasBacklight;
import Task1.src.CompTask.KeyboardPack.Keyboard;
import Task1.src.CompTask.KeyboardPack.KeyboardType;
import Task1.src.CompTask.ProcPack.AmountOfCores;
import Task1.src.CompTask.ProcPack.Frequency;
import Task1.src.CompTask.ProcPack.Manufacturer;
import Task1.src.CompTask.ProcPack.Processor;
import Task1.src.CompTask.RamPack.Ram;
import Task1.src.CompTask.RamPack.RamType;
import Task1.src.CompTask.ScreenPack.Screen;
import Task1.src.CompTask.ScreenPack.ScreenType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(3, 2);
        arithmeticCalculator.calculate(Operation.ADD);
        arithmeticCalculator.calculate(Operation.SUBTRACT);
        arithmeticCalculator.calculate(Operation.MULTIPLY);


        List<Computer> computers = new ArrayList<>();

        // 1. ASUS ZenBook 14
        Processor proc1 = new Processor();
        proc1.setManufacturer(Manufacturer.INTEL);
        proc1.setFrequency(Frequency.GHZ_3_5);
        proc1.setAmountOfCores(AmountOfCores.EIGHT);
        proc1.setWeight(0.05);

        Ram ram1 = new Ram();
        ram1.setType(RamType.DDR4);
        ram1.setVolume(16);
        ram1.setWeight(0.02);

        HardDrive hdd1 = new HardDrive();
        hdd1.setHardType(HardType.SSD);
        hdd1.setVolume(512);
        hdd1.setWeight(0.15);

        Screen screen1 = new Screen();
        screen1.setDiagonal(15.6);
        screen1.setScreenType(ScreenType.IPS);
        screen1.setWeight(0.6);

        Keyboard kb1 = new Keyboard();
        kb1.setKeyboardType(KeyboardType.MEMB);
        kb1.setHasBacklight(HasBacklight.YES);
        kb1.setWeight(0.3);

        computers.add(new Computer("ASUS", "ZenBook 14", kb1, screen1, hdd1, ram1, proc1));

        // 2. Apple MacBook Pro
        Processor proc2 = new Processor();
        proc2.setManufacturer(Manufacturer.APPLE);
        proc2.setFrequency(Frequency.GHZ_3_0);
        proc2.setAmountOfCores(AmountOfCores.TEN);
        proc2.setWeight(0.03);

        Ram ram2 = new Ram();
        ram2.setType(RamType.DDR5);
        ram2.setVolume(32);
        ram2.setWeight(0.025);

        HardDrive hdd2 = new HardDrive();
        hdd2.setHardType(HardType.SSD);
        hdd2.setVolume(1024);
        hdd2.setWeight(0.12);

        Screen screen2 = new Screen();
        screen2.setDiagonal(14.2);
        screen2.setScreenType(ScreenType.IPS);
        screen2.setWeight(0.55);

        Keyboard kb2 = new Keyboard();
        kb2.setKeyboardType(KeyboardType.SCIS);
        kb2.setHasBacklight(HasBacklight.YES);
        kb2.setWeight(0.28);

        computers.add(new Computer("Apple", "MacBook Pro 14", kb2, screen2, hdd2, ram2, proc2));

        // 3. Lenovo IdeaPad (бюджетный)
        Processor proc3 = new Processor();
        proc3.setManufacturer(Manufacturer.AMD);
        proc3.setFrequency(Frequency.GHZ_2_5);
        proc3.setAmountOfCores(AmountOfCores.FOUR);
        proc3.setWeight(0.06);

        Ram ram3 = new Ram();
        ram3.setType(RamType.DDR3);
        ram3.setVolume(8);
        ram3.setWeight(0.02);

        HardDrive hdd3 = new HardDrive();
        hdd3.setHardType(HardType.HDD);
        hdd3.setVolume(1000);
        hdd3.setWeight(0.4);

        Screen screen3 = new Screen();
        screen3.setDiagonal(15.6);
        screen3.setScreenType(ScreenType.TN);
        screen3.setWeight(0.65);

        Keyboard kb3 = new Keyboard();
        kb3.setKeyboardType(KeyboardType.MEMB);
        kb3.setHasBacklight(HasBacklight.NO);
        kb3.setWeight(0.32);

        computers.add(new Computer("Lenovo", "IdeaPad 3", kb3, screen3, hdd3, ram3, proc3));

        // 4. MSI (игровой)
        Processor proc4 = new Processor();
        proc4.setManufacturer(Manufacturer.INTEL);
        proc4.setFrequency(Frequency.GHZ_4_5);
        proc4.setAmountOfCores(AmountOfCores.SIXTEEN);
        proc4.setWeight(0.08);

        Ram ram4 = new Ram();
        ram4.setType(RamType.DDR5);
        ram4.setVolume(64);
        ram4.setWeight(0.04);

        HardDrive hdd4 = new HardDrive();
        hdd4.setHardType(HardType.SSD);
        hdd4.setVolume(2048);
        hdd4.setWeight(0.18);

        Screen screen4 = new Screen();
        screen4.setDiagonal(17.3);
        screen4.setScreenType(ScreenType.VA);
        screen4.setWeight(0.9);

        Keyboard kb4 = new Keyboard();
        kb4.setKeyboardType(KeyboardType.MECH);
        kb4.setHasBacklight(HasBacklight.YES);
        kb4.setWeight(0.5);

        computers.add(new Computer("MSI", "Titan GT77", kb4, screen4, hdd4, ram4, proc4));

        // Вывод
        for (Computer c : computers) {
            System.out.println(c);
            System.out.println("Total weight: " + c.totalWeight() + " kg");
            System.out.println("------------------------------");
        }
    }
}