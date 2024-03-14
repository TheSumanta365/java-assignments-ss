public class LeftDownTriangle {
        public static void main(String[] args) {
            int rows = 5; // Number of rows in the triangle

            // Outer loop for rows
            for (int i = 1; i <= rows; i++) {

                for (int j = rows; j >=i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


}
