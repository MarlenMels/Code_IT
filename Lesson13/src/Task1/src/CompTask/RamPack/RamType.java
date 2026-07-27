package Task1.src.CompTask.RamPack;

public enum RamType {
    DDR1("DDR1"),
    DDR2("DDR2"),
    DDR3("DDR3"),
    DDR4("DDR4"),
    DDR5("DDR5");

    private final String typeOfRam;

    RamType(String typeOfRam){
        this.typeOfRam = typeOfRam;
    }

    public String getTypeOfRam() {
        return typeOfRam;
    }

    @Override
    public String toString() {
        return "Type{" +
                "typeOfRam='" + typeOfRam + '\'' +
                '}';
    }
}
