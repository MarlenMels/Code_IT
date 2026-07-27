package Task1.src.CompTask.ProcPack;


public class Processor {
    private Frequency frequency;
    private AmountOfCores amountOfCores;
    private Manufacturer manufacturer;
    private double weight;

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public AmountOfCores getAmountOfCores() {
        return amountOfCores;
    }

    public void setAmountOfCores(AmountOfCores amountOfCores) {
        this.amountOfCores = amountOfCores;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", amountOfCores=" + amountOfCores +
                ", manufacturer=" + manufacturer +
                ", weight=" + weight +
                '}';
    }
}
