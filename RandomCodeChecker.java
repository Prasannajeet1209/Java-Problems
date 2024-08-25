import java.util.Scanner;
import java.util.Random;

public class RandomCodeChecker {
    public static void main(String[] args) {
        // Generate a random code
        String generatedCode = generateRandomCode(6); // Generating a 6-character code
        System.out.println("Generated Code: " + generatedCode);

        // Prompt user to enter the code
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the code: ");
        String userInput = scanner.nextLine();

        // Check if the entered code matches the generated code
        if (generatedCode.equals(userInput)) {
            System.out.println("Code matched! Access granted.");
        } else {
            System.out.println("Code did not match. Access denied.");
        }

        scanner.close();
    }

    // Method to generate a random alphanumeric code of given length
    private static String generateRandomCode(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilderProgram code = new StringBuilderProgram(length);

        for (int i = 0; i < length; i++) {
            code.append(characters.charAt(random.nextInt(characters.length())));
        }

        return code.toString();
    }
}
