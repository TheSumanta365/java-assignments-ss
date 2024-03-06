/*  Write a program to find the sum and product of all elements of an array.
 */
import java.util.Scanner;

class Assignment05{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        long product = 1; 

        for (int num : array) {
            sum += num;
            product *= num;
        }

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);

    }
}
