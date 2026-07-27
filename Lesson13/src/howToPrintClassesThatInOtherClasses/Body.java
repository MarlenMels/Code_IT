package howToPrintClassesThatInOtherClasses;

public class Body {
    private String type;

    public Body(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "howToPrintClassesThatInOtherClasses.Body{" +
                "type='" + type + '\'' +
                '}';
    }
}
