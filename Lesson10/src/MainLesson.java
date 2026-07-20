import java.util.Scanner;

public class MainLesson {

    static String booksInfo = "";

    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            addBook(name);
            addBook(name, amountOfPages());
            addBook(name, amountOfPages(), priceOfBook());
            printInfo();
        }
    }

    public static String inputBookName() {
        System.out.println("Enter a book name: ");
        return new Scanner(System.in).nextLine();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0);
    }

    public static int amountOfPages(){
        System.out.println("Enter amount of pages of the book: ");
        return new Scanner(System.in).nextInt();
    }

    public static double priceOfBook(){
        System.out.println("Enter price of the book: ");
        return new Scanner(System.in).nextDouble();
    }

    public static void addBook(String bookName, int pageCount){
        addBook(bookName, pageCount, 0);
    }

    public static void addBook(String bookName, int pageCount, double price){
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " pages, price: " + (price > 0 ? price : "N/A");
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }

}
