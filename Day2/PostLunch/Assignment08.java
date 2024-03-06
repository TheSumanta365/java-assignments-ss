/*  Consider an integer array, the number of elements in which is determined by the user. The elements are also taken as input from the user. Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
HINT : 
maximum difference = higest-lowest
minimum difference = second lowest - lowest
 */

import java.util.Scanner;

public class Assignment08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int maxDiffPair1 = 0;
        int maxDiffPair2 = 1;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (Math.abs(array[j] - array[i]) > Math.abs(array[maxDiffPair2] - array[maxDiffPair1])) {
                    maxDiffPair1 = i;
                    maxDiffPair2 = j;
                }
            }
        }

        int minDiffPair1 = 0;
        int minDiffPair2 = 1;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (Math.abs(array[j] - array[i]) < Math.abs(array[minDiffPair2] - array[minDiffPair1])) {
                    minDiffPair1 = i;
                    minDiffPair2 = j;
                }
            }
        }

        System.out.println("Pair with maximum difference: (" + array[maxDiffPair1] + ", " + array[maxDiffPair2] + ")");
        System.out.println("Pair with minimum difference: (" + array[minDiffPair1] + ", " + array[minDiffPair2] + ")");
    }
}
