/*  Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.
 */
import java.util.Scanner;

class Assignment04{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        int numbers[]=new int[10];
        for (int i = 0; i < 10; i++) {
            int numbers[i] = scanner.nextInt();
}
int reversed=new int[10];
   for (int i = 0; i < 10; i++) {
            reversed[i] = numbers[9 - i];
        }

        System.out.print("Original Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println(); 

        System.out.print("Reversed Array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}