import java.util.Scanner;

    public class ReversePyramid {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the number of rows (height) of the reverse pyramid from the user
            System.out.print("Enter the number of rows for the reverse pyramid: ");
            int rows = scanner.nextInt();

            // Loop to print the reverse pyramid pattern
            for (int i = rows; i >= 1; i--) {
                // Print spaces for the left side of the reverse pyramid
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }

                // Print '*' characters for the reverse pyramid
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("*");
                }

                System.out.println(); // Move to the next line after printing each row
            }

            scanner.close();
        }
    }

