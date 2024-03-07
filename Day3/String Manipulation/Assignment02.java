/* Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is. For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.*/

import java.util.Scanner;
public class Assignment02{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        String[] names = fullName.split(" ");
        int nameCount = names.length;

        if (nameCount >= 2) {
            StringBuilder abbreviation = new StringBuilder();

            for (int i = 0; i < nameCount - 1; i++) {
                abbreviation.append(names[i].charAt(0)).append(".");
            }

            abbreviation.append(names[nameCount - 1]);

            System.out.println("Abbreviation: " + abbreviation);
        } else {
            System.out.println("Please enter a valid full name with a first and last name.");
        }

    }
}
