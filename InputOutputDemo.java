// Import the Scanner class for user input
import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        // Prompt for and input an integer
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();

        // Prompt for and input a decimal number
        System.out.print("Enter a decimal number: ");
        double userDouble = input.nextDouble();

        // Consume the leftover newline character
        input.nextLine(); // Consume newline

        // Prompt for and input a string
        System.out.print("Enter a word or sentence: ");
        String userString = input.nextLine();

        // Output the integer with formatting
        System.out.printf("Your integer: %d%n", userInt);

        // Output the decimal number with formatting
        System.out.printf("Your decimal number: %.2f%n", userDouble);

        // Output the string with formatting
        System.out.printf("Your string: %s%n", userString);

        // Close the Scanner object to release resources
        input.close();
    }
}
