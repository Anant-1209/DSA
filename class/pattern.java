//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

public class pattern {
    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows - 2; i >= 0; i--) {
            // Print spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();

        }

    }
}