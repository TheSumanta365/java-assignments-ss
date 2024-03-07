/* Write a program to check if a given string is a Palindrome.
*/

import java.util.Scanner;
public class Assignment04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int i = 0, j = inputString.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (inputString.charAt(i) != inputString.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        System.out.println(isPalindrome ? "palindrome." : "Not a palindrome.");
    }
}


