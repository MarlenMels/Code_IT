package Task1.src.CompTask.KeyboardPack;

public enum KeyboardType {

    MECH("mechanical"),
    MEMB("membrane"),
    SCIS("scissor-switch");

    private final String type;

    KeyboardType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "KeyboardType{" +
                "type='" + type + '\'' +
                '}';
    }
}
