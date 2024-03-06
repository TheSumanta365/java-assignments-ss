/*A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 100 to 500.
*/
import java.util.Scanner;
public class Assignment08 {
    public static void main(String[] args) {
        for (int i = 100; i <= 500; i++) {
            int originalNumber = i;
            int result = 0;

            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, 3);
                originalNumber /= 10;
            }

            if (result == i) {
            System.out.print("Armstrong numbers between 100 and 500: ");
                System.out.print(i + " ");
            }
        }
    }
}