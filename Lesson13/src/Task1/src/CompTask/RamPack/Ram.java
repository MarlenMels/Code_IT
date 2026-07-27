package Task1.src.CompTask.RamPack;

public class Ram {
    private RamType type;
    private int volume;
    private double weight;

    public RamType getType() {
        return type;
    }

    public void setType(RamType type) {
        this.type = type;
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
        return "Ram{" +
                "type=" + type +
                ", volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
