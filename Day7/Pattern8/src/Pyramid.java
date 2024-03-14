import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows (height) of the pyramid from the user
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();

        // Loop to print the pyramid pattern
        for (int i = 1; i <= rows; i++) {
            // Print spaces for the left side of the pyramid
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print '*' characters for the pyramid
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line after printing each row
        }

        scanner.close();
    }
}
