import java.util.Scanner;

    import java.util.Scanner;

    public class Pattern2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows :");
            int a = sc.nextInt();
            for (int i = 1; i <= a; i++) {
                for (int k = 1; k< i; k++) {
                    System.out.print("  ");
                }
                for (int j = i; j <=a; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }



