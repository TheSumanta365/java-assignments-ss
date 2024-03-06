/* Find largest and smallest elements of an array.
 */
import java.util.Scanner;

public class Assignment07{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}

