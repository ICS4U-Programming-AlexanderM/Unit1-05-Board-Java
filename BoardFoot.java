import java.util.Scanner;
/**
* This program calculates the length of a board.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-03-02
*/

public final class BoardFoot {
    /**
    * For style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private BoardFoot() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Print messages.
    *
    * @param args Unused
    */
    public static void main(String[] args) {
        // Declare variables
        String stringInput = "";
        double width = 0;
        double height = 0;
        double length = 0;
        try {
            // Prompt the user to enter the width and height
            System.out.println("Enter the width in inches: ");
            final Scanner line = new Scanner(System.in);
            stringInput = line.nextLine();
            // Change from string to double
            width = Double.parseDouble(stringInput);

            System.out.println("Enter the height in inches: ");
            final Scanner newLine = new Scanner(System.in);
            stringInput = line.nextLine();
            // Change from string to double
            height = Double.parseDouble(stringInput);

            // Check for negative inputs.
            if (height <= 0 || width <= 0) {
                System.out.println("Input must be positive.");
            } else {
                // Calculate the length needed for 1 board foot
                length = calculateBoardFoot(width, height);

                // Output the result
                System.out.print("To make 1 board foot, ");
                System.out.format("the length is %.2f inches.%n", length);
            }
        } catch (NumberFormatException err) {
            System.out.println("Invalid input.");
        }
    }

    /**
    * This function does the math necessary for the program.
    *
    * @param width of board
    * @param height of board
    * @return functionLength
    */
    public static double calculateBoardFoot(double width, double height) {
        // 1 board foot in cubic inches.
        final double volume = 144.0;

        // Calculate the length.
        final double functionLength = volume / (width * height);

        return functionLength;
    }
}
