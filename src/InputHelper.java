import java.util.Scanner;

public class InputHelper {

    public static int getInt(Scanner pipe, String prompt) {
        int result = 0;
        boolean validInput = false;

        do {
            System.out.print(prompt); // Display the prompt message
            if (pipe.hasNextInt()) { // Check if the next input is an integer
                result = pipe.nextInt(); // Read the integer
                pipe.nextLine(); // Clear the input buffer (newline fix)
                validInput = true; // Valid input received
            } else {
                String trash = pipe.nextLine(); // Read the invalid input
                System.out.println("Invalid input: \"" + trash + "\". Please enter a valid integer."); 
            }
        } while (!validInput);

        return result;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int userInt = getInt(console, "Enter an integer: ");
        System.out.println("You entered: " + userInt);
    }
}
