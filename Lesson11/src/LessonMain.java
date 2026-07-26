public class LessonMain {
    public static void main(String[] args) {
        Duck krya = new Duck("Krya", 3, "gray");
        Duck.footCount = 2;
        Duck gylya = new Duck("Gylya", 5, "silver");

        krya.fly();
        gylya.fly();
    }
}
