import java.util.Scanner;

public class ReverseStringSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        
        // Reverse the string using StringBuilder
        String reversedString = new StringBuilderProgram(input).reverse().toString();
        
        // Output the reversed string
        System.out.println("Reversed string: " + reversedString);
    }
}
