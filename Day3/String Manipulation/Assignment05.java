/*Input a string which contains some palindrome substrings. Find out the position of palindrome substrings if exist and replace it by *. (For example if input string is “bob has a radar plane” then it should convert in “*** has a ***** plane”.
*/

import java.util.Scanner;
public class Assignment05{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String[] words = inputString.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            int start = 0, end = word.length() - 1;
            boolean isPalindrome = true;

            while (start < end) {
                if (word.charAt(start) != word.charAt(end)) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            if (isPalindrome) {
                StringBuilder asterisks = new StringBuilder();
                for (int j = 0; j < word.length(); j++) {
                    asterisks.append("*");
                }
                words[i] = asterisks.toString();
            }
        }

        System.out.println("Result: " + String.join(" ", words));
    }
}


