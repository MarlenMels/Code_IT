package Task1.src.MathTask;

public class ArithmeticCalculator {
    private double n1;
    private double n2;

    public ArithmeticCalculator(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void calculate(Operation operation){
        if(operation == Operation.ADD){
            System.out.println("Sum of two numbers equal to: " + (n1 + n2));
        } else if(operation == Operation.SUBTRACT){
            System.out.println("Substraction of two numbers equal to: " + (n1 - n2));
        } else if(operation == Operation.MULTIPLY){
            System.out.println("Multiplication of two numbers equal to: " + (n1 * n2));
        }
    }
}
