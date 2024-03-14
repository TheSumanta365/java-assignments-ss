    import java.util.Scanner;

    public class HollowPyramid {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the number of rows (height) of the pyramid from the user
            System.out.print("Enter the number of rows for the pyramid: ");
            int rows = scanner.nextInt();

            // Loop to print the pyramid pattern
            for (int i = 1; i <= rows; i++) {
                // Print spaces for the left side of the pyramid
                for (int j = i; j < rows; j++) {
                    System.out.print(" ");
                }

                // Print asterisks for the pyramid
                for (int k = 1; k <= (2 * i - 1); k++) {
                    if (k == 1 || k == (2 * i - 1) || i == rows) {
                        System.out.print("*"); // Print '*' for the first, last, or bottom row
                    } else {
                        System.out.print(" "); // Print spaces for the hollow part of the pyramid
                    }
                }

                System.out.println(); // Move to the next line after printing each row
            }

            scanner.close();
        }
    }
}
