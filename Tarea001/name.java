import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Main class
public class Name {

    public static void main(String[] args) {
        // Create a Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read the name from console

        // Try-with-resources to handle file writing
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("names.txt", true))) {
            writer.write(name);           // Write the name to the file
            writer.newLine();             // Add a new line
            System.out.println("Hello " + name + ", your name has been saved in a file.");
        } catch (IOException e) {
            // Handle possible file writing errors
            System.err.println("Error writing to file: " + e.getMessage());
        }

        scanner.close(); // Close the scanner to free resources
    }
}