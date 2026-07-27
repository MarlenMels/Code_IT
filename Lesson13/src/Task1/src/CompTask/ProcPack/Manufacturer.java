package Task1.src.CompTask.ProcPack;

public enum Manufacturer {
    INTEL("Intel"),
    AMD("AMD"),
    APPLE("Apple"),
    QUALCOMM("Qualcomm"),
    MEDIATEK("MediaTek");

    private final String value;

    Manufacturer(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + value + '\'' +
                '}';
    }
}
