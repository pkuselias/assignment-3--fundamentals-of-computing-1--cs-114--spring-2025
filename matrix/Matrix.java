public class Matrix {
  private int[][] matrix;

  public Matrix(int size) {
    matrix = new int[size][size];
  }

  public void printMatrix() {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if ((i + j) == (matrix.length - 1)) {
          System.out.printf("\t\u001B[33m%d\u001B[0m", matrix[i][j]);
        } else {
          System.out.printf("\t%d", matrix[i][j]);
        }
      }

    System.out.println();
    }

  System.out.println();
  }
}
