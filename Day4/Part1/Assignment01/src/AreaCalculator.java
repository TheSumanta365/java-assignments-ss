import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Area rectangle = new Area();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        rectangle.setDim(length, breadth);

        System.out.println("Area of the rectangle: " + rectangle.getArea());

        scanner.close();
    }
}
