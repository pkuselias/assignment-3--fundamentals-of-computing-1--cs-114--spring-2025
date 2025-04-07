import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int size = 0;
    Matrix matrix;
    boolean isValid = false;

    Scanner scan = new Scanner(System.in);

    System.out.printf("\nEnter a positive integer: ");

    while (isValid == false) {
      if (scan.hasNextInt()) {
        size = scan.nextInt();
        isValid = true;

        if (size < 1) {
          isValid = false;
          System.out.printf("\nInvalid input. Please enter a positive integer: ");
          scan.nextLine();
        }

      } else {
        System.out.printf("\nInvalid input. Please enter a positive integer: ");
        scan.nextLine();
      }
    }

  scan.close();

  System.out.println();

  System.out.printf("Your matrix is %d x %d\n", size, size);

  System.out.println();

  matrix = new Matrix(size);

  System.out.printf("Default matrix:\n\n");

  matrix.printMatrix();
  }
}
