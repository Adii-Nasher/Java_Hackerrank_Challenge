// Code following clean code principles
import java.util.Scanner;

public class DataTypes {
    
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";
        
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store user input
        int i2;
        double d2;
        String s2;

        // Prompt the user to enter an integer, a double, and a string
        System.out.print("Please enter an integer: ");
        i2 = scanner.nextInt();
        System.out.print("Please enter a double: ");
        d2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Please enter a string: ");
        s2 = scanner.nextLine();

        // Print the sum of the two integer variables
        System.out.println("The sum of " + i + " and " + i2 + " is " + (i + i2));

        // Print the sum of the two double variables
        System.out.println("The sum of " + d + " and " + d2 + " is " + (d + d2));

        // Concatenate and print the two string variables
        System.out.print("The concatenated string is " + s + s2);

        // Close the scanner object
        scanner.close();
    }
}