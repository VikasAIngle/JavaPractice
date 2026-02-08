package basics;

// Java Program for different types of user input

import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        
    Scanner scanner =  new Scanner(System.in);
    
    System.out.println("Enter your name:");
    String name = scanner.nextLine().trim();
    
    System.out.println("Enter your hobbies (separated by comma, e.g., reading, hiking):");
    // Using split with a comma is often more robust than a space for multi-word entries.
    // The trim() removes leading/trailing whitespace from the whole line.
    String[] hobbies = scanner.nextLine().trim().split(",");

    // --- Reading multi-line input for the tech stack ---
    System.out.print("How many technologies are in your tech stack? ");
    int techCount = scanner.nextInt();
    scanner.nextLine(); // This is crucial to consume the leftover newline character after nextInt()

    String[] techStack = new String[techCount];
    System.out.println("Enter your " + techCount + " technologies (one per line):");
    for (int i = 0; i < techCount; i++) {
        techStack[i] = scanner.nextLine().trim();
    }
    
    System.out.println("Your Name is "+name);
    System.out.println("Your Hobbies are: "+ Arrays.toString(hobbies));
    System.out.println("Your Tech Stack is: "+ Arrays.toString(techStack));

    // It's good practice to close the scanner to release resources.
    scanner.close();
    }
}