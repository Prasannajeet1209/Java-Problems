public class adv1pattern {
    public static void main(String[] args) {
        int n = 4; // Number of rows
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) { // Corrected loop condition
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= i; k++) { // Properly placed loop
                System.out.print("*"); // Added semicolon
            }
            // Move to the next line
            System.out.println();
        }
    }
}