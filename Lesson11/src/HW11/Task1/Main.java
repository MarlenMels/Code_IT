package HW11.Task1;

public class Main {
    public static void main(String[] args) {
        Phone.country = "China";
        Phone iphone = new Phone("87083111247", "Iphone 14", 0.143);
        Phone technoSpark = new Phone();
        Phone samsung = new Phone("87002447334", "Samsung S 24 Ultra", 0.200);

        technoSpark.receiveCall("Marlen");
        iphone.receiveCall("Marlen", "87083111247");
        samsung.receiveCall("Diko", "87002341234");
    }
}
