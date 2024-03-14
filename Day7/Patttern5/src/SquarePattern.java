import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the square from the user
        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();

        // Loop to print the square pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        scanner.close();
    }
}

