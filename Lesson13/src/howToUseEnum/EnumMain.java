package howToUseEnum;

public class EnumMain {
    static void main() {
        Deliver deliver = new Deliver();
        deliver.calculateDeliverPrice(DeliverTypes.AERO);
    }
}
