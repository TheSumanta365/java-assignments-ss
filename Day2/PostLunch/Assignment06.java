/* Initialize and print all elements of a 2D array.
 */
import java.util.Scanner;

public class Assignment06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] myArray = new int[rows][columns];

        System.out.println("Enter elements");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The 2D array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
