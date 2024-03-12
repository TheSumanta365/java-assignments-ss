public class OperationApp {
    public static double calculate(double num1,double num2,MyInterface operation){
        return operation.performOperation(num1,num2);
    }
    public static void main(String[] args) {
        MyInterface addition =(a,b)->a+b;
        double result = calculate(5, 3, addition);
        System.out.println("Result of addition: " + result);

        MyInterface subtraction = (a, b) -> a - b;
        double resultSubtraction = calculate(8, 3, subtraction);
        System.out.println("Result of subtraction: " + resultSubtraction);

        MyInterface multiplication = (a, b) -> a * b;
        double resultMultiplication = calculate(8, 3, multiplication);
        System.out.println("Result of multiplication: " + resultMultiplication);
    }
}
