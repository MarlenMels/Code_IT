import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MainLesson {
//    static int[] array = {1, 2, 3, 4, 5, 6, 7};

    static int x = 0;
    static int y = 0;


    public static void main(String[] args) {
        while(true){
            int dir = direction();
            if (dir == 1) {
                y -= step();
            } else if (dir == 2) {
                y += step();
            } else if (dir == 3) {
                x -= step();
            } else if (dir == 4) {
                x += step();
            } else if (dir == 5) {
                showCoordinates();
            } else {
                error();
                break;
            }
        }
    }

    public static int direction(){
        System.out.println("Choose the direction where you want to move: ");
        System.out.println("1 - ↓");
        System.out.println("2 - ↑");
        System.out.println("3 - ←");
        System.out.println("4 - →");
        return new Scanner(System.in).nextInt();
    }

    public static int step(){
        System.out.println("Now enter amount of steps: ");
        return new Scanner(System.in).nextInt();
    }

    public static void showCoordinates(){
        System.out.println("Coordinates: x = " + x + ", y = " + y);
    }

    public static void error(){
        System.out.println("You entered invalid number");
    }
}
