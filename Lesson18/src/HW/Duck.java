package HW;

public class Duck extends Animal{

    public Duck(){}

    public Duck(double weight, int age, String name){
        super(weight, age, name);
    }

    public void move(){
        System.out.println("A duck named " + super.getName() + " is running across the ground");
    }
}
