import java.util.Scanner;

    public class AverageCalculator{
        public void calculateAndPrintAverage(double num1, double num2, double num3) {
            double average = (num1 + num2 + num3) / 3;
            System.out.println("Average of the three numbers: " + average);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the third number: ");
            double num3 = scanner.nextDouble();

            AverageCalculator averageCalculator = new AverageCalculator();

            averageCalculator.calculateAndPrintAverage(num1, num2, num3);

            scanner.close();
        }
    }


