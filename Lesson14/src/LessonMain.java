public class LessonMain {
    public static void main(String[] args) {
        String s = "Hello world"; //why we write like this?
        String name = new String("Marlen"); //why we not write like this?

        //stack stores only primitive data types and method calls
        //stack works with LIFO rule
        // Last-IN-First-Out
        // stack has memory limit
        //it happens when you call methods that calls another methods
        //error StackOverflow
        //stack faster

        //heap(куча)
        //when you create new class(object) it means that you ask Java to give you memory but heap slower than stack

        int a = 51;
        int b = a;

        a = 52;

        System.out.println(a);
        System.out.println(b);

        Human vasya = new Human("Vasya", 20);
        Human petya = vasya;

        petya.setName("Timur");
        //never copy like that

        Human vas = new Human("Vasya", 20);
        Human pet = new Human(vas.getName(), vas.getAge());
        //copy like that

        System.out.println(vas.equals(pet));

        String bs = "Test";
        String bb = "Test";

        System.out.println(bs.equals(bb));  //this is the right way to compare Strings

        String s1 = "123";
        Integer num = 123;

        System.out.println(num + Integer.parseInt(s1));

        String numStr = String.valueOf(num);
    }
}
