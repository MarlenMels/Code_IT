package Task1.src.CompTask.HardPack;

public class HardDrive {
    private HardType hardType;
    private int volume;
    private double weight;

    public HardType getHardType() {
        return hardType;
    }

    public void setHardType(HardType hardType) {
        this.hardType = hardType;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "hardType=" + hardType +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
