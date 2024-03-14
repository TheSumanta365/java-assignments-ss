import java.util.Scanner;

    public class HollowTriangle{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the height of the triangle from the user
            System.out.print("Enter the height of the triangle: ");
            int height = scanner.nextInt();

            // Loop to print the hollow triangle pattern
            for (int i = 1; i <= height; i++) {
                // Print spaces for the left side of the triangle
                for (int j = 1; j <= height - i; j++) {
                    System.out.print(" ");
                }

                // Print '*' for the first column and last row, or for the last column
                if (i == 1 || i == height) {
                    for (int j = 1; j <= i * 2 - 1; j++) {
                        System.out.print("*");
                    }
                } else { // Print '*' only for the first and last column, otherwise print space
                    for (int j = 1; j <= i * 2 - 1; j++) {
                        if (j == 1 || j == i * 2 - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }

                System.out.println(); // Move to the next line after printing each row
            }

            scanner.close();
        }
    }

