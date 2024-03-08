import java.util.Scanner;

public class MatrixDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for matrix A: ");
        int rowsA = scanner.nextInt();

        System.out.print("Enter the number of columns for matrix A: ");
        int columnsA = scanner.nextInt();

        Matrix matrixA = new Matrix(rowsA, columnsA);

        System.out.println("Enter the elements for matrix A:");

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                System.out.print("Element at position (" + i + ", " + j + "): ");
                int value = scanner.nextInt();
                matrixA.setElement(i, j, value);
            }
        }

        System.out.print("Enter the number of rows for matrix B: ");
        int rowsB = scanner.nextInt();

        System.out.print("Enter the number of columns for matrix B: ");
        int columnsB = scanner.nextInt();

        Matrix matrixB = new Matrix(rowsB, columnsB);

        System.out.println("Enter the elements for matrix B:");

        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < columnsB; j++) {
                System.out.print("Element at position (" + i + ", " + j + "): ");
                int value = scanner.nextInt();
                matrixB.setElement(i, j, value);
            }
        }

        System.out.println("Matrix A:");
        matrixA.printMatrix();

        System.out.println("Matrix B:");
        matrixB.printMatrix();

        Matrix sumMatrix = matrixA.add(matrixB);
        if (sumMatrix != null) {
            System.out.println("Sum of matrices A and B:");
            sumMatrix.printMatrix();
        }

        Matrix productMatrix = matrixA.multiply(matrixB);
        if (productMatrix != null) {
            System.out.println("Product of matrices A and B:");
            productMatrix.printMatrix();
        }

        scanner.close();
    }
}
