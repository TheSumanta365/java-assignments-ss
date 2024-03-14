import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Rows : ");
        int rows=sc.nextInt();
        System.out.println("Columns : ");
        int columns=sc.nextInt();
        int[][] array1=new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at position [" + i + "][" + j + "]: ");
                array1[i][j] = sc.nextInt();
            }
        }

    }
}
