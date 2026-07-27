package Task1.src.CompTask.ScreenPack;

public enum ScreenType {
    IPS("IPS"),
    TN("TN"),
    VA("VA");

    private final String type;

    ScreenType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ScreenType{" +
                "type='" + type + '\'' +
                '}';
    }
}
