package Task1.src.CompTask.ProcPack;

public enum AmountOfCores {
    TWO(2),
    FOUR(4),
    SIX(6),
    EIGHT(8),
    TEN(10),
    TWELVE(12),
    SIXTEEN(16),
    TWENTY_FOUR(24),
    THIRTY_TWO(32);

    private final int value;

    AmountOfCores(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "AmountOfCores{" + value +
                '}';
    }
}
