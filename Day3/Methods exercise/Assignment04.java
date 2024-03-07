/* 
4. Using recursion, define a method to know nth term of a Fibonacci series.
 */

import java.util.Scanner;
public class Assignment04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n for the nth term: ");
        int n = scanner.nextInt();
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci series is: " + result);
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}


