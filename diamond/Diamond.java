import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int dimensions = 0;
    boolean isValid = false;

    Scanner scan = new Scanner(System.in);

    System.out.printf("\nEnter a positive integer: ");

    while (!isValid) {
      if (scan.hasNextInt()) {
        dimensions = scan.nextInt();
        isValid = true;

        if (dimensions < 1) {
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

    if (dimensions != 1) {
      if ((dimensions % 2) != 0) {
        for (int i = 0; i < dimensions; i++) {

        }
      }

      else {
        for (int i = 0; i < dimensions; i++) {

        }
      }

    } else {
      System.out.println("*");
      System.out.println();
    }
  }
}
