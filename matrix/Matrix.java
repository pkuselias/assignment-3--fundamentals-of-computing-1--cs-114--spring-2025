public class Matrix {
  private int[][] matrix;
  final String HIGHLIGHT = "\u001B[33m";
  final String RESET = "\u001B[0m";

  public Matrix(int size) {
    matrix = new int[size][size];
    System.out.printf("Your matrix is %d x %d\n", size, size);
  }

  public void printMatrix() {
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        if ((row + col) == (matrix.length - 1)) {
          System.out.printf("\t%s%d%s", HIGHLIGHT, matrix[row][col], RESET);
        } else {
          System.out.printf("\t%d", matrix[row][col]);
        }
      }

    System.out.println();
    }

  System.out.println();
  }

  public void populateMatrix() {
    int i = 1;
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = i;
        i++;
      }
    }
  }

  private void swap(int x1, int y1, int x2, int y2) {
    int firstElement = matrix[x1][y1];
    int secondElement = matrix[x2][y2];
    matrix[x1][y1] = secondElement;
    matrix[x2][y2] = firstElement;
  }

  public void flipMatrix() {
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        if ((row + col) < (matrix.length - 1)) {
          swap(row, col, (matrix.length - row - 1), (matrix.length - col - 1));
        }
      }
    }
  }

}
