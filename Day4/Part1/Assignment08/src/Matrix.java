public class Matrix {
    private int numRows;
    private int numColumns;
    private int[][] elements;

    public Matrix(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.elements = new int[numRows][numColumns];
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumColumns() {
        return numColumns;
    }

    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < numRows && j >= 0 && j < numColumns) {
            elements[i][j] = value;
        } else {
            System.out.println("Invalid position");
        }
    }

    public Matrix add(Matrix matrix) {
        if (numRows == matrix.getNumRows() && numColumns == matrix.getNumColumns()) {
            Matrix result = new Matrix(numRows, numColumns);

            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numColumns; j++) {
                    result.setElement(i, j, elements[i][j] + matrix.elements[i][j]);
                }
            }
            return result;
        } else {
            System.out.println("Matrices cannot be added");
            return null;
        }
    }

    public Matrix multiply(Matrix matrix) {
        if (numColumns == matrix.getNumRows()) {
            Matrix result = new Matrix(numRows, matrix.getNumColumns());

            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < matrix.getNumColumns(); j++) {
                    int sum = 0;
                    for (int k = 0; k < numColumns; k++) {
                        sum += elements[i][k] * matrix.elements[k][j];
                    }
                    result.setElement(i, j, sum);
                }
            }
            return result;
        } else {
            System.out.println("Matrices cannot be multiplied");
            return null;
        }
    }

    public void printMatrix() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }
}
