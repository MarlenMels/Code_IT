package Task1.src.CompTask;

import Task1.src.CompTask.HardPack.HardDrive;
import Task1.src.CompTask.KeyboardPack.Keyboard;
import Task1.src.CompTask.ProcPack.Processor;
import Task1.src.CompTask.RamPack.Ram;
import Task1.src.CompTask.ScreenPack.Screen;

public class Computer {
    private Processor processor;
    private Ram ram;
    private HardDrive hardDrive;
    private Screen screen;
    private Keyboard keyboard;

    private final String vendor;
    private final String name;

    public Computer(String vendor, String name, Keyboard keyboard, Screen screen, HardDrive hardDrive, Ram ram, Processor processor) {
        this.vendor = vendor;
        this.name = name;
        this.keyboard = keyboard;
        this.screen = screen;
        this.hardDrive = hardDrive;
        this.ram = ram;
        this.processor = processor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public double totalWeight(){
        return processor.getWeight() + ram.getWeight() +
                hardDrive.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", ram=" + ram +
                ", hardDrive=" + hardDrive +
                ", screen=" + screen +
                ", keyboard=" + keyboard +
                ", vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
