import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows for the triangle
        System.out.print("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt();

        // Generate the triangle
        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
