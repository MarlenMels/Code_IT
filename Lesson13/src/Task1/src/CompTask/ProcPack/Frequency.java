package Task1.src.CompTask.ProcPack;

public enum Frequency {
    GHZ_2_0(2.0),
    GHZ_2_5(2.5),
    GHZ_3_0(3.0),
    GHZ_3_5(3.5),
    GHZ_4_0(4.0),
    GHZ_4_5(4.5),
    GHZ_5_0(5.0);

    private final double value;

    Frequency(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Frequency{" + value +
                "GHz}";
    }
}
