public class Human {
    String name;
    String gender;
    int age;

    public Human(){

    }

    public Human(String nameHuman, int ageHuman){
        name = nameHuman;
        age = ageHuman;
    }

    public Human(String nameHuman, String genderHuman, int ageHuman){
        this.name = nameHuman;
        gender = genderHuman;
        age = ageHuman;
    }

    public void walk(){
        System.out.println(name + "did 10 steps");
    }
}
