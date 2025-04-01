import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int dimensions = 0;
    boolean isValid = false;

    Scanner scan = new Scanner(System.in);

    System.out.printf("\nEnter a positive integer: ");

    while (isValid == false) {
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
        String space = " ", star = "*", finalSpaces, finalStars;
        int spacesNumber = (dimensions - 1) / 2;
        int starNumber = 1;
        int lines = dimensions;

        for (int i = 1; i <= dimensions; i++) {
          //if (spacesNumber < 0) {
            //spacesNumber = -1 * spacesNumber;
          //}

          finalSpaces = "";

          if (spacesNumber >= 0) {
            for (int j = 1; j <= spacesNumber; j++) {
              finalSpaces += space;
            }

          } else {
            for (int j = 1; j <= (-1 * spacesNumber); j++) {
              finalSpaces += space;
            }
          }

          finalStars = "";

          for (int k = 1; k <= starNumber; k++) {
            finalStars += star;
          }

          System.out.println(finalSpaces + finalStars);

          spacesNumber--;

          if (starNumber < lines) {
            starNumber += 2;

          } else {
            starNumber -= 2;
            lines -= 2;
          }
        }

      } else {
        for (int i = 0; i < dimensions; i++) {

        }
      }

    } else {
      System.out.println("*");
    }

    System.out.println();
  }
}
