import java.util.Scanner;

public class MainLesson {
    public static void main(String[] args) {


//        for (int i = 0; i < 10; i++) {
//            if (i < 3 || i > 7) {
//                continue;
//            }
//            System.out.println(i);
//        }
//        boolean isContinue = true;
//        while (isContinue) {
//            System.out.println("Hello");
//            System.out.println("Continue? (1/0)");
//
//            int input = new Scanner(System.in).nextInt();
//            if (input == 0) {
//                isContinue = false;
//            }
//        }
//
//        do {
//            isContinue = true;
//            System.out.println("Hello");
//
//        } while (!isContinue);


        System.out.println("1 - up; 2 - down; 3 - left; 4 - right;");
        boolean check = true;
        int x = 0, y = 0;
        while (check) {
            int choice = new Scanner(System.in).nextInt();
            if (choice == 1) {
                y++;
            } else if (choice == 2) {
                y--;
            } else if (choice == 3) {
                x++;
            } else if (choice == 4) {
                x--;
            } else {
                System.out.println("Error");
                check = false;
            }
            System.out.println("Coordinates x: " + x);
            System.out.println("Coordinates y: " + y);
        }
    }
}
