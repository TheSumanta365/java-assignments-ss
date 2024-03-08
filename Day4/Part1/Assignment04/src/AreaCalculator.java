import java.util.Scanner;

    public class AreaCalculator {
        public static void main(String[] args) {
            // Input length and breadth from the user
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();

            System.out.print("Enter the breadth of the rectangle: ");
            double breadth = scanner.nextDouble();

            // Create an instance of the 'Area' class
            Area rectangle = new Area(length, breadth);

            // Calculate and print the area
            double area = rectangle.returnArea();
            System.out.println("Area of the rectangle: " + area);

            scanner.close();
        }
    }

