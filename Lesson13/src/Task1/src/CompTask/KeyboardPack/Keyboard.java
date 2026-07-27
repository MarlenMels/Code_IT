package Task1.src.CompTask.KeyboardPack;

public class Keyboard {
    private KeyboardType keyboardType;
    private HasBacklight hasBacklight;
    private double weight;

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(KeyboardType keyboardType) {
        this.keyboardType = keyboardType;
    }

    public HasBacklight getHasBacklight() {
        return hasBacklight;
    }

    public void setHasBacklight(HasBacklight hasBacklight) {
        this.hasBacklight = hasBacklight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboardType=" + keyboardType +
                ", hasBacklight=" + hasBacklight +
                ", weight=" + weight +
                '}';
    }
}
