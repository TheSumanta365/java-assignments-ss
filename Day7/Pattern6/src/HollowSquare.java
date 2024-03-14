import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the square from the user
        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();

        // Loop to print the hollow square pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Print '*' for boundary rows or columns, otherwise print space
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }

        scanner.close();
    }
}
