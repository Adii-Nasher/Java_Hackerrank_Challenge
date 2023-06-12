// Import necessary classes for input/output and data structures
import java.util.Scanner;

// Create a public class named "Solution"
public class Recursion {

    // Define a static method to calculate the factorial of an integer
    public static int factorial(int n){
        // If the input is greater than 1, recursively calculate the factorial of the input minus one and multiply it by the input
        return (n > 1) ? n * factorial(n-1) : 1;
    }
    
    // Define the main method
    public static void main(String[] args) {
        // Create a new instance of the Scanner class to read input from the user
        Scanner scan = new Scanner(System.in);
        // Prompt the user to enter an integer
        System.out.println("Please enter an integer:");
        // Read the user's input and store it in a variable named "n"
        int n = scan.nextInt();
        // Close the Scanner instance to prevent resource leaks
        scan.close();
        // Print the result of the factorial method called with the user's input
        System.out.println("The factorial of " + n + " is " + factorial(n) + ".");
    }
}

