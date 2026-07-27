package howToUseEnum;

public enum DeliverTypes {
    AERO("Delivery price will be 300"),
    STEP("Delivery price will be 100"),
    AUTO("Delivery price will be 200"),
    WATER("howToUseEnum.Deliver price will be 300");
    private String value;

    DeliverTypes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
