/*Write a program to replace a given substring in a sentence with another string. For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, the new sentence should be printed as ”A snowman with snow”.*/

import java.util.Scanner;
public class Assignment07{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the substring to be replaced: ");
        String oldSubstring = scanner.nextLine();

        System.out.print("Enter the replacement string: ");
        String newSubstring = scanner.nextLine();

        String modifiedSentence = sentence.replace(oldSubstring, newSubstring);

        System.out.println("\nNew Sentence:");
        System.out.println(modifiedSentence);
    }
}


