package HW;

public class Dog extends Animal{
    public Dog(){

    }

    public Dog(double weight, int age, String name){
        super(weight, age, name);
    }

    public void move(){
        System.out.println("A dog named " + super.getName() + " is running across the ground");
    }
}
