/* Write a program to find the number of vowels, consonents, digits and white space characters in a string.*/

import java.util.Scanner;
public class Assignment03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowels = 0, consonants = 0, digits = 0, whiteSpaces = 0;

        inputString = inputString.toLowerCase();

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if ((ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                consonants++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else if (Character.isWhitespace(ch)) {
                whiteSpaces++;
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of white spaces: " + whiteSpaces);
    }
}

