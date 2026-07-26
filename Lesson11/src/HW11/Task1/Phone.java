package HW11.Task1;

public class Phone {
    public String numberOfPhone;
    public String modelOfPhone;
    public double weightOfPhone;
    public static String country;

    public Phone(){

    }


    public Phone(String numberOfPhone, String modelOfPhone, double weightOfPhone){
        this.numberOfPhone = numberOfPhone;
        this.modelOfPhone = modelOfPhone;
        this.weightOfPhone = weightOfPhone;
    }




    public void receiveCall(String callerName){
        receiveCall(callerName, "");
    }

    public void receiveCall(String callerName, String phoneNumber){
        System.out.println(callerName + " is calling to you\nphone number: " + (phoneNumber.isEmpty() ? "" : phoneNumber));
    }
}
