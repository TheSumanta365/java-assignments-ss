/*Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.*/

import java.util.Scanner;
public class Assignment01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int max = maxNum(num1, num2, num3);
        System.out.println("Maximum number: " + max);

        int min = minNum(num1, num2, num3);
        System.out.println("Minimum number: " + min);

    }

    private static int maxNum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    private static int minNum(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}


