import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    int size;
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


  }
}
