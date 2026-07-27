package Task1.src.CompTask.KeyboardPack;

public enum HasBacklight {
    YES("yes, it has a backlight"),
    NO("no, it has not a backlight");

    private final String isHas;

    HasBacklight(String isHas){
        this.isHas = isHas;
    }

    public String getIsHas() {
        return isHas;
    }

    @Override
    public String toString() {
        return "HasBacklight{" +
                "isHas?='" + isHas + '\'' +
                '}';
    }
}
