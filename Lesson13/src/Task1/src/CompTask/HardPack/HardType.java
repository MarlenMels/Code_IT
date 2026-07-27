package Task1.src.CompTask.HardPack;

public enum HardType {
    HDD("HDD"),
    SSD("SSD");

    private final String type;

    HardType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "HardType{" +
                "type='" + type + '\'' +
                '}';
    }
}
