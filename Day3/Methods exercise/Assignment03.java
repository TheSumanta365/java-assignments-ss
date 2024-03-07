/* 
3. Print the multiplication table of 15 using recursion */

import java.util.Scanner;
public class Assignment03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The table of 15 is as follows ....");
        displayTable();

        scanner.close();
    }

    private static void displayTable() {
       for(int i=1;i<=10;i++){
              int result=15 * i;
            System.out.println(result);
        }
    }
}


