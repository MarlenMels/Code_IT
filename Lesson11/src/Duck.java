public class Duck {
    String name;
    int age;
    String color;

    static int footCount;

    public Duck(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void fly(){
        System.out.println(color + " duck, it's name is " + name + " flied to warm areas with " + footCount + " number of foots");
    }
}
